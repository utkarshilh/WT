#include<iostream>

using namespace std;

struct node{
    int data;
    node *next;
};

int main()
{
   node *head,*gg;

   int k =1;


   while(k==1)
   {
       int temp1;
       cout<<"input the element you want to insert in the link list";
       cin>>temp1;

       

       if(head==NULL)
       {
            head = (struct node *)malloc(sizeof(struct node));
            head->data = temp1;
            head->next = NULL;
            gg = head;

            

       }
       else 
       {
           node *temp = (struct node *)malloc(sizeof(struct node));
           temp->data = temp1;
           gg->next = temp;
           gg = gg->next;
       }
       int x =0;
       cout<<"press 1 to continue 0 to abort";
       cin>>x;
        k= x;

       
   } 

   gg = head;
   while(head!=NULL)
   {
       cout<<gg->data<<" ";
       gg = gg->next;

   }
}