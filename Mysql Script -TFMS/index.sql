create index my_index on batch(trainer_id);

use practice_tfms;

select * from Associate;
select * from batch;

select associate.associate_name , batch.topic_name from associate inner join batch on associate.associate_id = batch.associate_id;
