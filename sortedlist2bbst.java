TNode sortedListtoBST()
{
     int n = countNodes(head);
     return sortedListtoBSTRecur(n);
}
TNode sortedListtoBSTRecur(int n)
{
    if(n<=0)
     return null;
    TNode left = sortedListtoBSTRecur(n/2);
    TNode root = new TNode(head.data);
    root.left = left;
    head = head.next;
    root.right = sortedListToBSTRecur(n-n/2-1);
    return root;
}
    
