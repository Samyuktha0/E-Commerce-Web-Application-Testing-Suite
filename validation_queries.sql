-- Validate confirmed orders
SELECT * FROM orders WHERE user_id = 'testuser' AND status = 'confirmed';

-- Validate cart items
SELECT * FROM cart WHERE user_id = 'testuser';
