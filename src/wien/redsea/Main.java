package wien.redsea;

public class Main {

    public static void main(String[] args) {

        ChristmasTree tree = new ChristmasTree();
        tree.draw(15);

    }


    private static class ChristmasTree {

        void draw(int treeHeight){
            drawStar(treeHeight);
            drawMainPart(treeHeight);
            drawBasement(treeHeight);
        }

        private void drawMainPart(int treeHeight){
            for(int i = 0; i < treeHeight; i++){
                for(int j = treeHeight; j>i;j--){
                    System.out.print(" ");
                }
                for(int k=0; k<(2*i+1);k++){
                    System.out.print("+");
                }
                System.out.println();
            }
        }

        private void drawStar(int treeHeight){
            for(int j = 0; j < treeHeight; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }

        private void drawBasement(int treeHeight){
            for(int j = 0; j < treeHeight -1; j++){
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }
}
