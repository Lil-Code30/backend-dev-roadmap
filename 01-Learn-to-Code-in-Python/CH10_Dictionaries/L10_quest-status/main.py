
example = {
    "character_name": "Shallan",
    "quests": {
        "bridge_run": {
            "status": "Completed",
        },
        "talk_to_syl": {
            "status": "In Progress",
        },
    },
}

# example["quests"]["bridge_run"]["status"]

def get_quest_status(progress):
    return progress["quests"]["bridge_run"]["status"]

