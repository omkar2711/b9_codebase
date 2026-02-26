use zomato_db
select rating_color from restaurants;
--Indexing
Create INDEX City_idx on restaurants(City(100));
select city_idx from restaurants;

--full text search
alter table restaurants add FULLTEXT(locality);
select * from restaurants where match(Locality) against('City'); 