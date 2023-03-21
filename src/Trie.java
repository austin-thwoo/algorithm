class Trie {
    public Trie() {trieNode = new TrieNode();}



    private TrieNode trieNode;

    public void insert(String word) {
        TrieNode node=trieNode;// 시작 노드로 root 노드를 설정

        for (char c :word.toCharArray()){
            int index = c - 'a'; // 현재 문자 인덱스 계산
            if (node.children[index]==null){
                node.children[index]=new TrieNode();
            }
            node = node.children[index];
        }
        node.isEnd=true;
    }

    public boolean search(String word) {

        TrieNode node = trieNode; // 시작 노드로 root 노드를 설정

        for (char c : word.toCharArray()) {
            int index = c - 'a'; // 현재 문자 인덱스 계산
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }


        return true;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = trieNode; // 시작 노드로 root 노드를 설정

        for (char c : prefix.toCharArray()) {
            int index = c - 'a'; // 현재 문자 인덱스 계산
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }

        return true;
    }


    class TrieNode {
        boolean isEnd;
        TrieNode[] children;

        public TrieNode() {
            isEnd = false;
            children = new TrieNode[26];
        }
    }
}










