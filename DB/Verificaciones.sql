use EstadisticasCOVID;

drop procedure if exists mayorCrecimiento;

delimiter #
create procedure mayorCrecimiento( 
    in fechaIN date
)
begin
	declare i int;
	set i = 0;
	drop table if exists promedios;
    
    create temporary table promedios(
		subdivision varchar(50) primary key,
        prom float 
    );
    
    set @deps = (select count(*) from EstadisticasCOVID.Subdivision);
    
    while i < @deps do
		set @iDepart = (select idSubdivision from Subdivision limit i,1); 
		set @iFecha = date_add(fechaIN, interval -4 day);
		
		drop table if exists iDiferencias;  
		create temporary table iDiferencias(
			id int auto_increment primary key,
			dif int 
		);
		
		while @iFecha <= fechaIN do
			
			insert into iDiferencias (dif) values((select sum((select sum(masculinos + femeninos) from EstadisticasCOVID.Registro where fecha = @iFecha and idSubdivision = @iDepart)-(select sum(masculinos + femeninos) from EstadisticasCOVID.Registro where fecha = date_add(@iFecha, interval -1 day) and idSubdivision = @iDepart))));
			
			set @iFecha = date_add(@iFecha, interval 1 day);
		end while;
		
        -- select avg(dif) from iDiferencias;
		 insert into promedios values(@iDepart, (select avg(dif) from iDiferencias));
        -- select i;
		set i = i +1;
    end while;
	drop table if exists resultados;
    
    create temporary table resultados(
		subs varchar(60)
													);
    
    -- select * from iDiferencias;
	insert into resultados values((select subdivision from promedios order by prom desc limit 0,1)) ;
    insert into resultados values((select subdivision from promedios order by prom desc limit 1,1)) ;
    insert into resultados values((select subdivision from promedios order by prom desc limit 2,1)) ;
    insert into resultados values((select subdivision from promedios order by prom asc limit 0,1)) ;
    insert into resultados values((select subdivision from promedios order by prom asc limit 1,1)) ;
    insert into resultados values((select subdivision from promedios order by prom asc limit 2,1)) ;
    -- insert into resultados(mins) values((select subdivision from promedios order by prom asc limit 0,1));
	select * from resultados;
   
end #

drop procedure if exists verificarUsuario;

delimiter #
create procedure verificarUsuario(
	in nombre varchar(60),
    in pass varchar(60)
)
begin
select exists (select * from EstadisticasCOVID.Usuario where usuario=nombre and password = pass);
end #

drop procedure if exists registroUsuario;



