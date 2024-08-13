
public class AllocateMinimumPages {

    public static int findPages(int[] pages, int students) {
        if (students > pages.length) return -1;

        int low = pages[0], high = 0;
        for (int page : pages) {
            low = Math.max(low, page);
            high+= page;
        }

        while (low < high) {
            int mid = (low+high)/2;
            if(canAllocate(pages, students, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static boolean canAllocate(int[] pages, int students, int maxPages) {
        int currentPages =0, requiredStudents = 1;

        for(int page : pages) {
            if(currentPages+page > maxPages) {
                requiredStudents++;
                currentPages = page;
                if(requiredStudents > students) return false;
            } else {
                currentPages+= page;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] pages = {12, 34, 67, 90};
        int students = 2;
        System.out.println("Minimum number of maximum pages: " + findPages(pages, students));

    }
}