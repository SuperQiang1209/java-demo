package com.zhenggq.datastructure.ch11;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/15 14:41
 * @Description:
 * @Version: 1.0
 */
public class Tree {

    public Node root;

    /**
     * 功能描述:插入节点
     *
     * @param:
     * @return:
     * @author: Zhenggq
     * @date: 2018/9/15
     */
    public void insert(long val) {
        //初始化节点
        Node node = new Node(val);
        //当前节点
        Node current = root;


        if (current == null) {
            root = node;
            return;
        } else {
            Node parent;
            while (true) {
                parent = current;
                //插入到左边

                if (val < current.data) {

                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = node;
                        return;
                    }
                } else if (val > current.data) {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = node;
                        return;
                    }
                }
            }
        }
    }

    /**
     * 查找节点
     *
     * @param val
     * @return
     */
    public Node find(long val) {
        Node current = root;
        if (current == null) {
            return null;
        } else {
            while (true) {
                if (val < current.data) {
                    current = current.leftChild;
                } else if (val > current.data) {
                    current = current.rightChild;
                }

                if (current == null) {
                    return null;
                } else if (current != null && current.data == val) {
                    return current;
                }
            }
        }
    }

    /**
     * 功能描述:删除二叉树节点
     * 删除之前先找到要删的节点,找到节点后，这个要删除的节点可能会有三种情况需要考虑:
     * 1.该节点是叶子节点，没有子节点
     * 要删除叶子节点，只需要改变该节点的父节点的引用值，将指向该节点的引用设置为null就可以了
     * 2.该节点有一个子节点
     * 改变父节点的引用，将其直接指向要删除节点的子节点
     * 3.该节点有两个子节点
     * 要删除有两个子节点的节点，就需要使用它的后序后继来替代该节点。(用右子树中最小的树代替该节点的数据并递归删除那个节点)
     * 因为该节点有两个子节点，直接删除会对树造成影响,所以要找一个节点来继承该节点.
     *
     * @param:
     * @return:
     * @author: Zhenggq
     * @date: 2018/9/15
     */
    public boolean delete(long val) {
        //引用当前节点，从根节点开始
        Node currentNode = root;
        //引用当前接的父节点
        Node parentNode = root;
        //记录要删除的节点是左子节点 or 右子节点
        boolean isLeftChild = false;
        if (currentNode == null) {
            return false;
        }

        //查找节点
        while (val != currentNode.data) {

            parentNode = currentNode;
            if (val < currentNode.data) {
                currentNode = currentNode.leftChild;
                isLeftChild = true;
            } else if (val > currentNode.data) {
                currentNode = currentNode.rightChild;
                isLeftChild = false;
            }
            if (currentNode == null) {
                return false;
            }

        }

        //第一种情况:该节点是叶子节点，没有子节点
        if (currentNode.leftChild == null && currentNode.rightChild == null) {
            if (currentNode == root) {
                root = null;
            } else if (isLeftChild) {
                parentNode.leftChild = null;
            } else {
                parentNode.rightChild = null;
            }
        }

        //第二种情况：该节点有一个叶子节点
        else if (currentNode.leftChild == null) {
            if (currentNode == root) {
                root = currentNode.rightChild;
            } else if (isLeftChild) {
                parentNode.leftChild = currentNode.rightChild;
            } else {
                parentNode.rightChild = currentNode.rightChild;
            }

        } else if (currentNode.rightChild == null) {
            if (currentNode == root) {
                root = currentNode.leftChild;
            } else if (isLeftChild) {
                parentNode.leftChild = currentNode.leftChild;
            } else {
                parentNode.rightChild = currentNode.leftChild;
            }
        }

        //第三种情况:该节点有两个子节点
        else {
            //获取继承节点,当前节点右子树中节点下最小的数
            Node successor = getSuccessor(currentNode);
            if (currentNode == root) {
                root = successor;
            } else if (isLeftChild) {
                parentNode.leftChild = successor;
            } else {
                parentNode.rightChild = successor;
            }
            successor.leftChild = currentNode.leftChild;

        }
        return true;
    }

    /**
     * 获取中序后继节点,沿着节点的左子节点一直寻找,最后一个左节点就是继承节点.
     *
     * @return
     */
    private Node getSuccessor(Node delNode) {
        Node successor = delNode;
        Node successorParent = delNode;
        Node current = delNode.rightChild;

        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }

        if (successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }

        return successor;
    }

    /**
     * 功能描述: 前序遍历
     * 1.访问跟节点
     * 2.前序遍历左子节点
     * 3.前序遍历右子节点
     * 特点:前序遍历第一个节点是root节点
     *
     * @param:
     * @return:
     * @author: Zhenggq
     * @date: 2018/9/15
     */
    public void frontOrder(Node front) {
        if (front != null) {
            System.out.println(front.data);
            frontOrder(front.leftChild);
            frontOrder(front.rightChild);
        }
    }

    /**
     * 功能描述: 中序遍历,
     * 1.中序遍历左子节点
     * 2.访问根节点
     * 3.中序遍历右子节点
     * 特点:中序遍历root节点在中间,遍历后的数据是有序的(一般中序遍历应用比较多).
     *
     * @param:
     * @return:
     * @author: Zhenggq
     * @date: 2018/9/15
     */
    public void inOrder(Node in) {
        if (in != null) {
            inOrder(in.leftChild);
            System.out.println(in.data);
            inOrder(in.rightChild);
        }
    }

    /**
     * 功能描述:  后续遍历
     * 1.后续遍历左子节点
     * 2.后续遍历右子节点
     * 3.访问根节点
     * 特点：后续遍历root节点在最后。
     *
     * @param:
     * @return:
     * @author: Zhenggq
     * @date: 2018/9/15
     */
    public void laterOrder(Node later) {
        if (later != null) {
            laterOrder(later.leftChild);
            laterOrder(later.rightChild);
            System.out.println(later.data);
        }
    }

}
