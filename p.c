#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node*next;
}*head=NULL;
void create (int a[],int n){
    struct node *t,*last;
    t=(struct node*)malloc(sizeof(struct node));
    t->data=a[0];
    t->next=NULL;
    last=t;
    for(int i=1;i<n;i++){
        t=(struct node*)malloc(sizeof(struct node*));
        t->data=a[i];
        t->next=NULL;
        last->next=t;
        last=t;
    }

}
void display(struct node*p){
    while(p!=NULL){
        printf("%d the first node address is ",p->data);
        p=p->next;

    }
}
int main(){
    int a[]={2,3,4,5,6,6,7};
    create(a,7);
    display(head);
}
