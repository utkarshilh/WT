#include<bits/stdc++.h>
#include <iostream>

using namespace std;

void print(int *a,int n)
{
    for(int i=0;i<n;i++)
    cout<<a[i]<<" ";
    
}

// mergeSort merge funtion
void merge(int a[],int low ,int mid,int high)
{
    int i =low,j = mid+1;
    int k = low;
    int c[1000];
    
    
    while(i<=mid && j <=high)
    {
        if(a[i]<a[j])
        {
            c[k] = a[i];
            i++;
            k++;
            
        }
        else
        {
            c[k] = a[j];
            j++;
            k++;
            
        }
        
    }
    while(i<=mid)
    {
        c[k] = a[i];
        i++;
        k++;
        
    }
    while(j<=high)
    {
        c[k] = a[j];
        j++;
        k++;
        
    }
    
    for(int i=low ;i<=high;i++)
    {
        a[i] = c[i];
        
    }
}
void mergeSort(int a[],int low ,int high)
{
    if(low<high) // remeber this point
    {
       int  mid = (low+high)>>1;
        mergeSort(a,low,mid);
        mergeSort(a,mid+1,high);
        merge(a, low,mid,high);
        
    }
}



int main()
{
    
    int n;
    int a[1000];
    
    cin>>n;
    for(int i=0;i<n;i++)
    cin>>a[i];
    
    print(a,n);
    mergeSort(a,0,n-1);
    print(a,n);
    
    
    

    return 0;
}

