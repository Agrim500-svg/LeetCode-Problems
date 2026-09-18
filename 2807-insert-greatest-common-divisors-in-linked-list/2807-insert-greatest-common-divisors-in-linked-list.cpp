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
    ListNode* insertGreatestCommonDivisors(ListNode* head) {
        ListNode* first=head;
        while(first!=NULL && first->next!=NULL){
            ListNode* second=first->next;
            int a=first->val;
            int b=second->val;
            while(b!=0){
                int t=b;
                b=a%b;
                a=t;
            }
            int gcd=a;
            ListNode* g=new ListNode(gcd);
            first->next=g;
            g->next=second;
            first=second;
        }
        return head;        
    }
};