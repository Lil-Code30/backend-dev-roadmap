def should_serve_customer(customer_age, on_break, time):
    is_customer_old = customer_age >= 21
    is_barterner_working = on_break == False
    is_correct_time = 5 <= time <= 10

    return is_customer_old and is_barterner_working and is_correct_time