package ch07;
public class Car {
 int tire = 4;
 int door = 2;
 Car() {
 System.out.println("Car ��ü ����");
 }
 void move() {
 System.out.println("�̵�");
 }
 public int getTire() {
 return tire;
 }
 public void setTire(int tire) {
 this.tire = tire;
 }
 public int getDoor() {
 return door;
 }
 public void setDoor(int door) {
 this.door = door;
 }
}