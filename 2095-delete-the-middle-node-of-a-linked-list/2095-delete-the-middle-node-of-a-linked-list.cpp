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
    ListNode* deleteMiddle(ListNode* head) {
        ListNode* curr=head;
        int cnt=0;
        while(curr!=NULL){
            cnt++;
            curr=curr->next;
        }
        if(cnt==1){
            return NULL;
        }
        ListNode* curr1=head;
        ListNode* prev=NULL;
        for(int i=0;i<cnt/2;i++){
            prev=curr1;
            curr1=curr1->next;
        }
        prev->next=curr1->next;
        delete curr1;
        return head;
    }
};