class merge{
    public static void main(String args[]){
        int arr[]={1,8,5,4,87,5,15,48,8,};
        divide(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
    void divide(int[]arr,int i,int j){
        if(i<j){
            int m=i+(j-i)/2;
            divede(arr,i,m);
            divede(arr,m+1,j);
            conquer(arr,i,m,j);
        }
    }
    void conquer(int []arr,int i,int m,int j){
        int []l=new int[m-i+1];
        int r[]=new int[j-m];
        for(int o=0;o<l.length;o++){
            l[o]=arr[i+o];
        }
        for(int o=0;o<r.length;o++){
            r[o]=arr[m+1+o];
        }
        int s=0;
        int e=0;
        while(s<l.length&&e<r.length){
            if(l[s]<=r[e]){
                arr[i++]=l[s++];
            }else{
                arr[i++]=r[e++];
            }
        }
        if(s<l.length){
            arr[i++]=s[s++];
        }
        if(e<r.length){
            arr[i++]=r[e++];
        }
    }
}