/**
 *    跳表节点数据存储结构
 */
class SkipNode<E extends Comparable<? super E>> {
    public final E value; //节点存储的数据
    public final SkipNode<E>[] forward; //节点的指针数组
    
    /**
     * 根据节点的层级构造一个节点
     * @param level 节点层级
     * @param value 节点存储值
     */
	@SuppressWarnings("unchecked")
	public SkipNode(int level, E value) {
        forward = new SkipNode[level + 1];//level层的元素后面带着level+1的指针数组
        this.value = value;
    }
}

