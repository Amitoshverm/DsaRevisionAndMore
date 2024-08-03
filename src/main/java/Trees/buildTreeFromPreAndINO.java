package Trees;

import aaaaa.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class buildTreeFromPreAndINO {
    public static void main(String[] args) {

    }

    public TreeNode build(int[] preorder, int[] inorder){
        HashMap<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
         return construct(inorder, 0, inorder.length-1, inorderMap, inorder, 0, inorder.length-1);
    }

    public TreeNode construct(int[] preorder, int ps, int pe, Map<Integer, Integer> inorderMap, int[] inorder, int is
    , int ie) {
        if (ps > pe || is > ie) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[ps]);
        int inRoot = inorderMap.get(root.data);
        int numLeft = inRoot - ps;

        root.left = construct(preorder, ps+1, ps+numLeft, inorderMap, inorder, is, inRoot-1);
        root.right = construct(preorder, ps+numLeft+1, pe, inorderMap, inorder, inRoot+1, ie);
        return root;
    }
}
