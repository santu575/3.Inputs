public class exercise29 {
    public static int getBucketCount(double width, double height, double areaPerBucket, 
    int extraBuckets){
        if(width<0||height<0||areaPerBucket<0||extraBuckets<0){
            return -1;
        }
        return (int) Math.ceil(width*height/areaPerBucket - extraBuckets);
    }
    public static void main(String[] args) {
        System.out.println(getBucketCount(10, 12, 12.56, 5));
    }
}
