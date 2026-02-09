def filter_messages(messages):
    filtered_messages_list = []
    list_of_counts_of_dang = []
    
    for message in messages:
        words_in_message = message.split()
        good_words = []
        dang_words = []
        
        for word in words_in_message:
            if word == "dang":
                dang_words.append(word)
            else:
                good_words.append(word)
                
        good_words_sentence = " ".join(good_words)
        filtered_messages_list.append(good_words_sentence)
        
        list_of_counts_of_dang.append(len(dang_words))
    
    return filtered_messages_list, list_of_counts_of_dang
        
