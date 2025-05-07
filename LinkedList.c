#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int number;
    struct node *next;
} node;

int main() {
    node *list = NULL;

    for (int i = 0; i < 5; i++) {
        node *n = malloc(sizeof(node));
        if (n == NULL) { return 1; }
        n->number = i + 1;

        // Insert at the beginning
        n->next = list;
        list = n;
    }

    // Print the list
    for (node *tmp = list; tmp != NULL; tmp = tmp->next) {
        printf("%d -> ", tmp->number);
    }
    

    // Free memory
    while (list != NULL) {
        node *tmp = list;
        list = list->next;
        free(tmp);
    }

    return 0;
}
