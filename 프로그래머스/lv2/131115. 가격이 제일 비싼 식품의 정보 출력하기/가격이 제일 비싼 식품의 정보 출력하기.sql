select *
from food_product
where price = (SELECT max(price) as price from food_product);