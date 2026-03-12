//Lab task
#include <iostream>
using namespace std;

struct Node
{
    int data;
    Node* next;
    Node* prev;
};

Node* first = NULL;
Node* last = NULL;


// Insert at end
void insert_end()
{
    Node* p = new Node;

    cout << "Enter data: ";
    cin >> p->data;

    p->next = NULL;

    if(first == NULL)
    {
        p->prev = NULL;
        first = last = p;
    }
    else
    {
        last->next = p;
        p->prev = last;
        last = p;
    }
}


// Forward traversal
void display_forward()
{
    Node* p;

    for(p = first; p != NULL; p = p->next)
    {
        cout << p->data << " ";
    }

    cout << endl;
}


// Backward traversal
void display_backward()
{
    Node* p;

    for(p = last; p != NULL; p = p->prev)
    {
        cout << p->data << " ";
    }

    cout << endl;
}


// Insert before first node
void insert_before_first()
{
    Node* p = new Node;

    cout << "Enter data: ";
    cin >> p->data;

    if(first == NULL)
    {
        first = last = p;
        p->next = p->prev = NULL;
    }
    else
    {
        p->next = first;
        p->prev = NULL;
        first->prev = p;
        first = p;
    }
}


// Insert after last node
void insert_after_last()
{
    Node* p = new Node;

    cout << "Enter data: ";
    cin >> p->data;

    if(first == NULL)
    {
        first = last = p;
        p->next = p->prev = NULL;
    }
    else
    {
        p->next = NULL;
        p->prev = last;
        last->next = p;
        last = p;
    }
}


// Insert after a key
void insert_after_key()
{
    int key;
    cout << "Enter key value: ";
    cin >> key;

    Node* q = first;

    while(q != NULL && q->data != key)
        q = q->next;

    if(q == NULL)
    {
        cout << "Key not found\n";
        return;
    }

    Node* p = new Node;

    cout << "Enter new data: ";
    cin >> p->data;

    p->prev = q;
    p->next = q->next;

    if(q->next != NULL)
        q->next->prev = p;

    q->next = p;

    if(last == q)
        last = p;
}


// Delete first node
void delete_first()
{
    if(first == NULL)
    {
        cout << "List empty\n";
        return;
    }

    Node* p = first;

    first = first->next;

    if(first == NULL)
        last = NULL;
    else
        first->prev = NULL;

    delete p;
}


// Delete last node
void delete_last()
{
    if(last == NULL)
    {
        cout << "List empty\n";
        return;
    }

    Node* p = last;

    last = last->prev;

    if(last == NULL)
        first = NULL;
    else
        last->next = NULL;

    delete p;
}


// Delete by key
void delete_key()
{
    int key;
    cout << "Enter key to delete: ";
    cin >> key;

    Node* p = first;

    while(p != NULL && p->data != key)
        p = p->next;

    if(p == NULL)
    {
        cout << "Key not found\n";
        return;
    }

    if(first == p && last == p)
    {
        first = last = NULL;
    }
    else if(p == first)
    {
        first = first->next;
        first->prev = NULL;
    }
    else if(p == last)
    {
        last = last->prev;
        last->next = NULL;
    }
    else
    {
        p->next->prev = p->prev;
        p->prev->next = p->next;
    }

    delete p;
}


int main()
{
    int choice;

    while(true)
    {
        cout << "\n1 Insert End";
        cout << "\n2 Display Forward";
        cout << "\n3 Display Backward";
        cout << "\n4 Insert Before First";
        cout << "\n5 Insert After Last";
        cout << "\n6 Insert After Key";
        cout << "\n7 Delete First";
        cout << "\n8 Delete Last";
        cout << "\n9 Delete By Key";
        cout << "\n0 Exit";

        cout << "\nEnter choice: ";
        cin >> choice;

        switch(choice)
        {
            case 1: insert_end(); break;
            case 2: display_forward(); break;
            case 3: display_backward(); break;
            case 4: insert_before_first(); break;
            case 5: insert_after_last(); break;
            case 6: insert_after_key(); break;
            case 7: delete_first(); break;
            case 8: delete_last(); break;
            case 9: delete_key(); break;
            case 0: return 0;
        }
    }
}