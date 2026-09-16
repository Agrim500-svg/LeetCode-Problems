/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* swapNodes(ListNode* head, int k) {
        ListNode* curr=head;
        int cnt=0;
        while(curr!=NULL){
            cnt++;
            curr=curr->next;
        }
        ListNode* f=head;
        ListNode* s=head;
        for(int i=0;i<k-1;i++){
            f=f->next;
        }
        for(int i=1;i<cnt-k+1;i++){
            s=s->next;
        }
        int t=f->val;
        f->val=s->val;
        s->val=t;
        return head;
    }
};