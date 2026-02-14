def find_missing_ids(first_ids, second_ids):
    first_ids_set = set(first_ids)
    second_ids_sets = set(second_ids)

    missing_ids = first_ids_set - second_ids_sets

    return missing_ids
