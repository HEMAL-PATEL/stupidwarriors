//
//import engine.scene.mainScene;
//import engine.scene.startUpScene;
//import java.util.Timer;
//import java.util.TimerTask;
//import mahyarise.TAgraphics.GraphicsInterface;
///*
// * Copyright (C) 2014 Saeed Masoumi & Saeed Rajabzade.
// *
// * This library is free software; you can redistribute it and/or
// * modify it under the terms of the GNU Lesser General Public
// * License as published by the Free Software Foundation; either
// * version 2.1 of the License, or (at your option) any later version.
// *
// * This library is distributed in the hope that it will be useful,
// * but WITHOUT ANY WARRANTY; without even the implied warranty of
// * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// * Lesser General Public License for more details.
// *
// * You should have received a copy of the GNU Lesser General Public
// * License along with this library; if not, write to the Free Software
// * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
// * MA 02110-1301  USA
// */
//
///**
// *
// * @author Saeed Masoumi
// */
//public class StupidWarriors {
//    public static void JugeEngine(){
//        Judge judge = new Judge();
//        judge.setMapSize(200, 200);
//        int[][] a = new int [200][200];
//        for(int i=0;i<200;i++)
//            for(int j = 0 ;j<200;j++)
//                a[i][j] = 10;
//        judge.loadMap(a);
//        GraphicsInterface graphic;
//        graphic = new GraphicsInterface();
//        graphic.setJudge(judge);
//        graphic.start();
//
//    }
//    public static void main(String[] args) {
//  //      JugeEngine();
////        startUpScene startUp = new startUpScene();
////      startUp.RenderStartUpMenu();
////       // renderScene a = new renderScene();
//       // a.start();
////ImageDisplayTest a = new ImageDisplayTest();
//       // a.startAks();
//        //Xylophone b = new Xylophone();
//        //b.start();
////        TimerTest c = new TimerTest();
//       // c.main();
//                test();
//
//        mainScene scene = new mainScene();
//        scene.start();
//                //output FPS
//    }
//    public static void test(){
//
////     Cell one = new Cell(1, 1, 2);
////        Cell two = new Cell(2, 2, 2);
////        Cell twop = new Cell(3, 3, 2);
////        Cell []a={one,two};
////                Tank t2 = new Tank(one);
////        System.out.println(t2.isUnit());
////        two.setObjectInCell(t2);
////        Tank t = new Tank(two);
////     //   t.getNearestEnemy(a);
////        Tank t3 = new Tank(two);
////        t.setEnemy(t2);
////        t.getEnemy().setHealth(10);
////        System.out.println(t.health);
////        System.out.println(t2.health);
////        System.out.println(t3.health);
////        System.out.println(t.getEnemy().health);
//    }
//}
//
//
