package com.company.offer;

import com.company.structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 面试题37. 序列化二叉树
 * TODO:逃课
 */
public class Codec {
    public String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        } // root为null直接返回空字符串即可

        // 创建一个队列存储每一个非null节点
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root); // 将root先放进去
        // 定义一个成员变量存储序列化结果
        String results = "[" + root.val;
        while (!queue.isEmpty()) {
            // 每次从队列中取出一个节点，根据其左右子节点是否为null进行字符串拼接
            TreeNode tmp = queue.poll();
            if (tmp.left != null) {
                queue.offer(tmp.left);
                results += "," + tmp.left.val;
            } else {
                results += ",null";
            }
            // 上面处理left，下面处理right
            if (tmp.right != null) {
                queue.offer(tmp.right);
                results += "," + tmp.right.val;
            } else {
                results += ",null";
            }
        }
        // 处理完成之后添加上结束符
        results += "]";
        return results;
    }

    public TreeNode deserialize(String data) {
        if (data.length() == 2) {
            return null;
        }

        // 去除收尾的中括号字符
        data = data.substring(1, data.length() - 1);
        // 利用逗号分隔符获取每一个节点的值
        String[] vals = data.split(",");
        // 定义队列存储每一个有效节点，为了构建其左右子节点
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        queue.offer(root); // 第一个元素为root节点
        int i = 1; // 标记后续处理的节点值（包含null）
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            // 从队列中取出节点，然后根据是否为null，依次设置left和right
            // 如果不是null，则需要加入队列，后续需要处理此有效节点的左右节点
            if (vals[i].equals("null")) {
                tmp.left = null;
            } else {
                tmp.left = new TreeNode(Integer.parseInt(vals[i]));
                queue.offer(tmp.left);
            }
            i++;
            if (vals[i].equals("null")) {
                tmp.right = null;
            } else {
                tmp.right = new TreeNode(Integer.parseInt(vals[i]));
                queue.offer(tmp.right);
            }
            i++;
        }
        return root;
    }
}
