SELECT 
    u.user_id AS buyer_id,
    u.join_date AS join_date,
    IFNULL(tab.orders_in_2019, 0) AS orders_in_2019
FROM Users AS u
LEFT JOIN (
    SELECT 
        o.buyer_id,
        COUNT(o.item_id) AS orders_in_2019
    FROM Orders AS o
    WHERE YEAR(o.order_date) = 2019
    GROUP BY o.buyer_id
) AS tab
ON u.user_id = tab.buyer_id;
