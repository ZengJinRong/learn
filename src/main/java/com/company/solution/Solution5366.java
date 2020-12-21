package com.company.solution;

/**
 * 5366. 检查网格中是否存在有效路径
 */
public class Solution5366 {
    private static final char UP = 'W';
    private static final char DOWN = 's';
    private static final char LEFT = 'A';
    private static final char RIGHT = 'D';
    private static final char BLANK = ' ';

    private int y = 0;
    private int x = 0;
    private char direction = BLANK;

    public boolean hasValidPath(int[][] grid) {
        int yMax = grid.length - 1;
        int xMax = grid[0].length - 1;

        boolean isTwoWay = grid[0][0] == 4;

        while (x <= xMax && y <= yMax && x >= 0 && y >= 0) {
            if (x == xMax && y == yMax) {
                return deal(grid[y][x]);
            }
            if (!deal(grid[y][x])) {
                return false;
            }
        }

        if (isTwoWay) {
            x = 1;
            y = 0;
            direction = RIGHT;
            while (x <= xMax && y <= yMax && x >= 0 && y >= 0) {
                if (x == xMax && y == yMax) {
                    return deal(grid[y][x]);
                }
                if (!deal(grid[y][x])) {
                    return false;
                }
            }
        }
        return false;
    }

    private boolean deal(int type) {
        switch (type) {
            case 1:
                return type1();
            case 2:
                return type2();
            case 3:
                return type3();
            case 4:
                return type4();
            case 5:
                return type5();
            case 6:
                return type6();
        }
        return true;
    }

    private boolean type1() {
        direction = direction == BLANK ? RIGHT : direction;
        switch (direction) {
            case RIGHT:
            case LEFT:
                move();
                return true;
            default:
                return false;
        }
    }

    private boolean type2() {
        direction = direction == BLANK ? DOWN : direction;
        switch (direction) {
            case DOWN:
            case UP:
                move();
                return true;
            default:
                return false;
        }
    }

    private boolean type3() {
        if (direction == BLANK || direction == RIGHT) {
            direction = DOWN;
        } else if (direction == UP) {
            direction = LEFT;
        } else {
            return false;
        }
        move();
        return true;
    }

    private boolean type4() {
        if (direction == BLANK || direction == LEFT) {
            direction = DOWN;
        } else if (direction == UP) {
            direction = RIGHT;
        } else {
            return false;
        }
        move();
        return true;
    }

    private boolean type5() {
        if (direction == RIGHT) {
            direction = UP;
        } else if (direction == DOWN) {
            direction = LEFT;
        } else {
            return false;
        }
        move();
        return true;
    }

    private boolean type6() {
        if (direction == LEFT) {
            direction = UP;
        } else if (direction == BLANK || direction == DOWN) {
            direction = RIGHT;
        } else {
            return false;
        }
        move();
        return true;
    }

    private void move() {
        switch (direction) {
            case UP:
                y--;
                break;
            case DOWN:
                y++;
                break;
            case LEFT:
                x--;
                break;
            case RIGHT:
                x++;
                break;
        }
    }

    class pos {
        private int x = 0;
        private int y = 0;

        public pos(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
