#include<iostream>
using namespace std;
class node{
    int data;
    node next;


}*head;


int main()
{
    head = (struct node*)malloc(sizeof(struct node));
    head->data = 5;
    head->next = NULL;

    node* temp= (struct node*)malloc(sizeof(struct node));
    temp->data = 11;
    temp->next = NULL;

    head->next = temp;


    // inserting element in the begining of the linked list
    int xx;

    cout<<"input the element you want to insert in the head of the linked list";
    cin>>xx;

    temp = head;

     while(temp!=NULL)
    {
        cout<<temp->data<<" ";
        temp= temp->next;

    }
    cout<<endl;

    temp = (struct node *)malloc(sizeof(struct node));
    temp->data = xx;
    temp->next = head;
    head = temp;
    while(head!=NULL)
    {
        cout<<head->data<<" ";
        head = head->next;

    }

    // Inserting the element in the end of the linekd list
    
}