package OOP_5;

import java.util.Scanner;
import java.util.UUID;

public class Main {

    private static RobotMap map;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RobotMap robotMap = null;
        while (true) {
            System.out.print("Введите команду: ");
            String command = scanner.nextLine();
            String[] commandParts = command.split(" ");

            switch (commandParts[0]) {
                case "create-map":
                    int n = Integer.parseInt(commandParts[1]);
                    int m = Integer.parseInt(commandParts[2]);
                    robotMap = new RobotMap(n, m);
                    System.out.println("Карта создана");
                    break;

                case "create-robot":
                    int x = Integer.parseInt(commandParts[1]);
                    int y = Integer.parseInt(commandParts[2]);
                    Point position = new Point(x, y);
                    try {
                        RobotMap.Robot robot = robotMap.createRobot(position);
                        System.out.printf("Робот создан: %s\n", robot);
                    } catch (PositionException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case "move-robot":
                    UUID id = UUID.fromString(commandParts[1]);
                    RobotMap.Robot robot = robotMap.robots.get(id);
                    if (robot == null) {
                        System.out.println("Робот не найден");
                        break;
                    }
                    try {
                        robot.move();
                        System.out.printf("Робот передвинут: %s\n", robot);
                    } catch (PositionException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case "change-direction":
                    id = UUID.fromString(commandParts[1]);
                    robot = robotMap.robots.get(id);
                    if (robot == null) {
                        System.out.println("Робот не найден");
                        break;
                    }
                    RobotMap.Direction direction = RobotMap.Direction.valueOf(commandParts[2]);
                    robot.changeDirection(direction);
                    System.out.printf("Направление робота изменено: %s\n", robot);
                    break;

                default:
                    System.out.println("Неизвестная команда");
                    break;
            }
        }
    }

}