/**
 *    ����ڵ����ݴ洢�ṹ
 */
class SkipNode<E extends Comparable<? super E>> {
    public final E value; //�ڵ�洢������
    public final SkipNode<E>[] forward; //�ڵ��ָ������
    
    /**
     * ���ݽڵ�Ĳ㼶����һ���ڵ�
     * @param level �ڵ�㼶
     * @param value �ڵ�洢ֵ
     */
	@SuppressWarnings("unchecked")
	public SkipNode(int level, E value) {
        forward = new SkipNode[level + 1];//level���Ԫ�غ������level+1��ָ������
        this.value = value;
    }
}

