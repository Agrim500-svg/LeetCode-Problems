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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* curr=head;
        int cnt=0;
        while(curr!=NULL){
            cnt++;
            curr=curr->next;
        }
        if(cnt==1){
            return NULL;
        }
        if(n==cnt){
            return head->next;
        }
        ListNode* curr1=head;
        ListNode* prev=head;
        for(int i=0;i<cnt-n;i++){
            prev=curr1;
            curr1=curr1->next;
        }
        prev->next=curr1->next;
        delete curr1;
        return head;
    }
};