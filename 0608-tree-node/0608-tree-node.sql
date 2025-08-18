select t.id,
    case
        when t.p_id is null then "Root"
        when t.id in (select p_id from Tree ) then "Inner"
        when t.id not in (select p_id from Tree where p_id is not null ) then "Leaf"
    end as type
from Tree as t

