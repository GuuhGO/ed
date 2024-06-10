package arvore.aula.model;

public class TreeInt {
	private Node root;

	public TreeInt() {
		root = null;
	}

	public void infixSearch() throws Exception {
		infix(root);
	}

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.left = null;
		node.right = null;
		insertLeaf(node, root);
	}

	public int level() throws Exception {
		return treeLevel(root);

	}

	private int treeLevel(Node rootSubTree) throws Exception {
		if (root == null)
			throw new Exception("treeLevel - Tree is empty");
		if (rootSubTree.left == null && rootSubTree.right == null) {
			System.out.println("LEFT: " + rootSubTree.left.data + "\tRIGHT: " + rootSubTree.right.data);
			return 0;
		} else if (rootSubTree.left != null) {
			return 1 + treeLevel(rootSubTree.left);
		} else if (rootSubTree.left != null) {
			return 1 + treeLevel(rootSubTree.right);
		}
		int lvlR = treeLevel(rootSubTree.right);
		int lvlL = treeLevel(rootSubTree.left);
		System.out.println(lvlR);
		System.out.println(lvlL);
		return lvlR >= lvlL ? lvlR : lvlL;
	}

	public void postfixSearch() throws Exception {
		postfix(root);
	}

	public void prefixSearch() throws Exception {
		prefix(root);
	}

	public void print() throws Exception {

	}

	public void remove(int value) throws Exception {
		try {
			removeChild(root, value);
		} catch (Exception e) {
			throw new Exception("Value does not exist");
		}
	}

	public void search(int value) {
		try {
			Node node = nodeSearch(root, value);
			int level = nodeLevel(root, value);
			System.out.println("Dado: " + node.data);
			System.out.println("Level: " + level);
		} catch (Exception e) {
			System.out.println("Valor não existente!");
		}
	}

	private void change(Node parent, Node node, Node newNode) {
		if (parent.left != null && parent.left.data == node.data) {
			parent.left = newNode;
		} else if (parent.right.data == node.data) {
			parent.right = newNode;
		}
	}

	private void infix(Node rootSubTree) throws Exception {
		if (root == null) {
			throw new Exception("infix - Tree is empty!");
		}
		if (rootSubTree.left != null) {
			infix(rootSubTree.left);
		}
		System.out.print(rootSubTree.data + " ");
		if (rootSubTree.right != null) {
			infix(rootSubTree.right);
		}
	}

	private void insertLeaf(Node node, Node rootSubTree) {
		if (root == null) {
			root = node;
		} else {
			if (node.data < rootSubTree.data) {
				if (rootSubTree.left == null) {
					rootSubTree.left = node;
				} else {
					insertLeaf(node, rootSubTree.left);
				}
			}
			if (node.data >= rootSubTree.data) {
				if (rootSubTree.right == null) {
					rootSubTree.right = node;
				} else {
					insertLeaf(node, rootSubTree.right);
				}
			}
		}
	}

	private int nodeLevel(Node rootSubTree, int value) throws Exception {
		if (root == null)
			throw new Exception("nodeLevel - Tree is empty!");
		else if (rootSubTree.data > value)
			return 1 + nodeLevel(rootSubTree.left, value);
		else if (rootSubTree.data < value)
			return 1 + nodeLevel(rootSubTree.right, value);
		else
			return 0;
	}

	private Node nodeParent(Node parent, Node rootSubTree, int value) throws Exception {
		if (root == null) {
			throw new Exception("nodeParent - Tree is empty");
		} else if (value < rootSubTree.data) {
			return nodeParent(rootSubTree, rootSubTree.left, value);
		} else if (value > rootSubTree.data) {
			return nodeParent(rootSubTree, rootSubTree.right, value);
		} else {
			if (parent == null) {
				return root;
			} else {
				return parent;
			}
		}
	}

	private Node nodeSearch(Node rootSubTree, int value) throws Exception {
		if (root == null) {
			throw new Exception("nodeSearch - Tree is empty	");
		} else if (rootSubTree.data > value) {
			return nodeSearch(rootSubTree.left, value);
		} else if (rootSubTree.data < value) {
			return nodeSearch(rootSubTree.right, value);
		} else {
			return rootSubTree;
		}
	}

	private void postfix(Node rootSubTree) throws Exception {
		if (rootSubTree == null) {
			throw new Exception("postfix - Tree is empty!");
		}

		if (rootSubTree.left != null) {
			postfix(rootSubTree.left);
		}
		if (rootSubTree.right != null) {
			postfix(rootSubTree.right);
		}
		System.out.print(rootSubTree.data + " ");
	}

	private void prefix(Node rootSubTree) throws Exception {
		if (root == null) {
			throw new Exception("prefix - Tree is empty!");
		}
		System.out.print(rootSubTree.data + " ");
		if (rootSubTree.left != null) {
			prefix(rootSubTree.left);
		}
		if (rootSubTree.right != null) {
			prefix(rootSubTree.right);
		}
	}

	private void removeChild(Node rootSubTree, int value) throws Exception {
		Node node = nodeSearch(rootSubTree, value);
		if (node != null) {
			Node parent = nodeParent(null, root, node.data);
			if (node.left != null && node.right != null) {
				Node nodeSwap = node.left;
				while (nodeSwap.right != null) {
					nodeSwap = nodeSwap.right;
				}
				parent = nodeParent(null, root, nodeSwap.data);
				node.data = nodeSwap.data;
				nodeSwap.data = value;
				removeOneOrZeroLeaf(parent, nodeSwap);
			} else {
				removeOneOrZeroLeaf(parent, node);
			}
		} else {
			throw new Exception("Value does not exists");
		}
	}

	private void removeOneOrZeroLeaf(Node parent, Node node) {
		if (node.left == null && node.right == null) {
			change(parent, node, null);
		} else if (node.left == null) {
			change(parent, node, node.right);
		} else if (node.right == null) {
			change(parent, node, node.left);
		}
	}
}
