package Lab5A;

public class Hash {
    int[] hTable;
    String[] dTable;
    int len;
    public Hash(int l){
        int[] htable = new int[l];
        String[] dtable = new String[l];
        len = l;
    }

    private void addHash(int key,String str){
        int hash = key%len,s = hash;
        int c = 1;
        int d = 1;
        for (int i = 1; hTable[hash]!= 0 && hTable[hash] != key; i++ ){
            hash = (s + c*i + d*i)%len;
        }
        if(hTable[hash] != key){
            hTable[hash] = key;
            dTable[hash] = str;
        }
    }

    private String viewHash(int key){
        int hash = key%len,s = hash;
        int c = 1;
        int d = 1;
        for (int i = 1; hTable[hash] != key; i++ ){
            hash = (s + c*i + d*i)%len;
        }
        return dTable[hash];
    }
}
