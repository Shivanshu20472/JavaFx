package com.example.javafx;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Controller2 implements Initializable {

    int n = 0;
    static int c = 0;

    @FXML
    private Rectangle helmet3;

    private double z;
    private double z1;
    private double z2;
    private double z3;
    private double z4;
    private double z5;
    private double z6;
    private double z7;
    private double z8;
    private double z9;
    private double z10;
    private double z11;
    private double z12;
    private double z13;
    private double z14;
    private double z15;
    private double z16;
    private double z17;
    private double z18;
    private double z19;
    private double z20;
    private double z21;
    private double z22;
    private double z23;
    private double z24;
    private double z25;
    private double z26;
    private double z27;
    private double z28;
    private double z29;
    private double z30;
    private double z31;
    private double z32;
    private double z33;
    private double z34;
    private double z35;
    private double z36;
    private double z37;
    private double z38;
    private double z39;
    private double z40;
    private double z41;
    private double z42;
    private double z43;
    private double z44;
    private double z45;
    private double z46;
    private double z47;
    private double z48;
    private double z49;
    private double z50;


    @FXML
    private Label Points;

    @FXML
    private Label Location;

    @FXML
    private Rectangle island1;

    @FXML
    private Rectangle island2;

    @FXML
    private Rectangle island3;

    @FXML
    private Rectangle island4;

    @FXML
    private Rectangle island5;

    @FXML
    private  Rectangle island6;

    @FXML
    private Rectangle island7;

    @FXML
    private Rectangle island8;

    @FXML
    private Rectangle island9;

    @FXML
    private Rectangle island10;

    @FXML
    private Rectangle island11;

    @FXML
    private Rectangle island12;

    @FXML
    private Rectangle island13;

    @FXML
    private Rectangle island14;

    @FXML
    private Rectangle island15;

    @FXML
    private Rectangle island16;

    @FXML
    private Rectangle orc1;

    @FXML
    private Rectangle orc2;

    @FXML
    private Rectangle orc3;

    @FXML
    private Rectangle orc4;

    @FXML
    private Rectangle orc5;

    @FXML
    private Rectangle cloud1;

    @FXML
    private Rectangle block1;

    @FXML
    private Rectangle block2;

    @FXML
    private Rectangle block3;

    @FXML
    private Rectangle block4;

    @FXML
    private Rectangle chest1;

    @FXML
    private Rectangle chest2;

    @FXML
    private Rectangle chestcoin;

    @FXML
    private Rectangle orccoin1;

    @FXML
    private Rectangle orccoin2;

    @FXML
    private Rectangle orccoin3;

    @FXML
    private Rectangle orccoin4;

    @FXML
    private Rectangle weapon;

    @FXML
    private Rectangle coin1;

    @FXML
    private Rectangle coin2;

    @FXML
    private Rectangle coin3;

    @FXML
    private Rectangle coin4;

    @FXML
    private Rectangle coin5;

    @FXML
    private Rectangle coin6;

    @FXML
    private Rectangle coin8;

    @FXML
    private Rectangle coin9;

    @FXML
    private Rectangle coin10;

    @FXML
    private Rectangle coin11;

    @FXML
    private Rectangle coin12;

    @FXML
    private Rectangle telepoter;

    @FXML
    private Button move;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imageShow();
        collision();
        animation();
    }

    public void right() throws IOException {

        if(n<=8){
            helmet3.setX(z+=50);
            weapon.setX(z26+=50);
        }
        Location.setText("Location ; "+ n);

        double x = helmet3.getX();
        System.out.println(x);

        island1.setX(z1+=-80);

        island2.setX(z2+=-80);

        island3.setX(z3+=-80);

        island4.setX(z4+=-80);

        island5.setX(z5+=-80);

        island6.setX(z7+=-80);

        island7.setX(z9+=-80);

        island8.setX(z10+=-80);

        island9.setX(z14+=-80);

        island10.setX(z15+=-80);

        island10.setX(z16+=-80);

        island11.setX(z17+=-80);

        island12.setX(z18+=-80);

        island13.setX(z19+=-80);

        island14.setX(z20+=-80);

        island15.setX(z21+=-80);

        island16.setX(z22+=-80);

        block1.setX(z11+=-80);

        block2.setX(z12+=-80);

        block3.setX(z13+=-80);

        block4.setX(z24+=-80);

        chest1.setX(z25+=-80);

        chest2.setX(z36+=-80);

        chestcoin.setX(z42+=-80);

        orccoin1.setX(z43+=-80);

        orccoin2.setX(z44+=-80);

        orccoin3.setX(z45+=-80);

        orccoin4.setX(z46+=-80);

        coin1.setX(z27+=-80);

        coin2.setX(z28+=-80);

        coin3.setX(z32+=-80);

        coin4.setX(z33+=-80);

        coin5.setX(z34+=-80);

        coin6.setX(z35+=-80);

        coin8.setX(z37+=-80);

        coin9.setX(z38+=-80);

        coin10.setX(z39+=-80);

        coin11.setX(z40+=-80);

        coin12.setX(z41+=-80);

        telepoter.setX(z23+=-80);

        orc1.setX(z6+=-80);

        orc2.setX(z8+=-80);

        orc3.setX(z29+=-80);

        orc4.setX(z30+=-80);

        orc5.setX(z31+=-80);


        n++;
        System.out.println(n);
        if(b1>0){
            GameOverScene();
        }
        if(b2>0){
            nextScene();
        }
        collision();

    }

    public void imageShow(){
        Image i1 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Helmet3.png");
        helmet3.setFill(new ImagePattern(i1));


        Image i2 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands1.png");
        island1.setFill(new ImagePattern(i2));
        move.setVisible(true);

        Image i3 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\TheCloud.png");
        cloud1.setFill(new ImagePattern(i3));
        move.setVisible(true);

        Image i4 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands2.png");
        island2.setFill(new ImagePattern(i4));
        move.setVisible(true);

        Image i5 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands3.png");
        island3.setFill(new ImagePattern(i5));
        move.setVisible(true);

        Image i6 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands4.png");
        island4.setFill(new ImagePattern(i6));
        move.setVisible(true);

        Image i7 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Orc1.png");
        orc1.setFill(new ImagePattern(i7));
        move.setVisible(true);

        Image i8 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands5.png");
        island5.setFill(new ImagePattern(i8));
        move.setVisible(true);

        Image i9 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands6.png");
        island6.setFill(new ImagePattern(i9));
        move.setVisible(true);

        Image i12 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands7.png");
        island7.setFill(new ImagePattern(i12));
        move.setVisible(true);

        Image i13 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands8.png");
        island8.setFill(new ImagePattern(i13));
        move.setVisible(true);

        Image i14 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands9.png");
        island9.setFill(new ImagePattern(i14));
        move.setVisible(true);

        Image i15 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands10.png");
        island10.setFill(new ImagePattern(i15));
        move.setVisible(true);

        Image i16 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands11.png");
        island11.setFill(new ImagePattern(i16));
        move.setVisible(true);

        Image i17 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands1.png");
        island12.setFill(new ImagePattern(i17));
        move.setVisible(true);

        Image i18 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands2.png");
        island13.setFill(new ImagePattern(i18));
        move.setVisible(true);

        Image i19 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands3.png");
        island14.setFill(new ImagePattern(i19));
        move.setVisible(true);

        Image i20 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands4.png");
        island15.setFill(new ImagePattern(i20));
        move.setVisible(true);

        Image i21 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands5.png");
        island16.setFill(new ImagePattern(i21));
        move.setVisible(true);

        Image i23 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Coin.png");
        coin1.setFill(new ImagePattern(i23));
        coin2.setFill(new ImagePattern(i23));
        coin3.setFill(new ImagePattern(i23));
        coin4.setFill(new ImagePattern(i23));
        coin5.setFill(new ImagePattern(i23));
        coin5.setFill(new ImagePattern(i23));
        coin6.setFill(new ImagePattern(i23));
        coin8.setFill(new ImagePattern(i23));
        coin9.setFill(new ImagePattern(i23));
        coin10.setFill(new ImagePattern(i23));
        coin11.setFill(new ImagePattern(i23));
        coin12.setFill(new ImagePattern(i23));
        move.setVisible(true);

        Image i10 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Orc2.png");
        orc2.setFill(new ImagePattern(i10));
        move.setVisible(true);

        Image i11 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\telepoter.jpeg");
        telepoter.setFill(new ImagePattern(i11));
        move.setVisible(true);

        Image i22 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\ChestClosed.png");
        chest1.setFill(new ImagePattern(i22));
        move.setVisible(true);

        Image i28 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\ChestClosed.png");
        chest2.setFill(new ImagePattern(i28));
        move.setVisible(true);

        Image i24 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Orc3.png");
        orc3.setFill(new ImagePattern(i24));
        move.setVisible(true);

        Image i25 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Orc4.png");
        orc4.setFill(new ImagePattern(i25));
        move.setVisible(true);

        Image i26 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Orc5.png");
        orc5.setFill(new ImagePattern(i26));
        move.setVisible(true);

    }

    public void animation(){
        TranslateTransition t1 = new TranslateTransition();
        t1.setNode(cloud1);
        t1.setDuration(Duration.millis(2000));
        t1.setCycleCount(TranslateTransition.INDEFINITE);
        t1.setByX(900);
        t1.setAutoReverse(true);
        t1.play();

        TranslateTransition t2 = new TranslateTransition();
        t2.setNode(orc1);
        t2.setDuration(Duration.millis(550));
        t2.setCycleCount(TranslateTransition.INDEFINITE);
        t2.setByY(-25);
        t2.setAutoReverse(true);
        t2.play();

        TranslateTransition t20 = new TranslateTransition();
        t20.setNode(orc2);
        t20.setDuration(Duration.millis(1000));
        t20.setCycleCount(TranslateTransition.INDEFINITE);
        t20.setByY(-15);
        t20.setAutoReverse(true);
        t20.play();

        TranslateTransition t21 = new TranslateTransition();
        t21.setNode(orc3);
        t21.setDuration(Duration.millis(1000));
        t21.setCycleCount(TranslateTransition.INDEFINITE);
        t21.setByY(-15);
        t21.setAutoReverse(true);
        t21.play();

        TranslateTransition t22 = new TranslateTransition();
        t22.setNode(orc4);
        t22.setDuration(Duration.millis(1000));
        t22.setCycleCount(TranslateTransition.INDEFINITE);
        t22.setByY(-15);
        t22.setAutoReverse(true);
        t22.play();

        TranslateTransition t23 = new TranslateTransition();
        t23.setNode(orc5);
        t23.setDuration(Duration.millis(1000));
        t23.setCycleCount(TranslateTransition.INDEFINITE);
        t23.setByY(-15);
        t23.setAutoReverse(true);
        t23.play();

        TranslateTransition t3 = new TranslateTransition();
        t3.setNode(island1);
        t3.setDuration(Duration.millis(1000));
        t3.setCycleCount(TranslateTransition.INDEFINITE);
        t3.setByY(-15);
        t3.setAutoReverse(true);
        t3.play();

        TranslateTransition t4 = new TranslateTransition();
        t4.setNode(island2);
        t4.setDuration(Duration.millis(1000));
        t4.setCycleCount(TranslateTransition.INDEFINITE);
        t4.setByY(-15);
        t4.setAutoReverse(true);
        t4.play();

        TranslateTransition t5 = new TranslateTransition();
        t5.setNode(island3);
        t5.setDuration(Duration.millis(1000));
        t5.setCycleCount(TranslateTransition.INDEFINITE);
        t5.setByY(-15);
        t5.setAutoReverse(true);
        t5.play();

        TranslateTransition t7 = new TranslateTransition();
        t7.setNode(island5);
        t7.setDuration(Duration.millis(1000));
        t7.setCycleCount(TranslateTransition.INDEFINITE);
        t7.setByY(-15);
        t7.setAutoReverse(true);
        t7.play();

        TranslateTransition t8 = new TranslateTransition();
        t8.setNode(island6);
        t8.setDuration(Duration.millis(1000));
        t8.setCycleCount(TranslateTransition.INDEFINITE);
        t8.setByY(-15);
        t8.setAutoReverse(true);
        t8.play();

        TranslateTransition t9 = new TranslateTransition();
        t9.setNode(island7);
        t9.setDuration(Duration.millis(1000));
        t9.setCycleCount(TranslateTransition.INDEFINITE);
        t9.setByY(-15);
        t9.setAutoReverse(true);
        t9.play();

        TranslateTransition t10 = new TranslateTransition();
        t10.setNode(island8);
        t10.setDuration(Duration.millis(1000));
        t10.setCycleCount(TranslateTransition.INDEFINITE);
        t10.setByY(-15);
        t10.setAutoReverse(true);
        t10.play();

        TranslateTransition t11 = new TranslateTransition();
        t11.setNode(island9);
        t11.setDuration(Duration.millis(1000));
        t11.setCycleCount(TranslateTransition.INDEFINITE);
        t11.setByY(-15);
        t11.setAutoReverse(true);
        t11.play();

        TranslateTransition t12 = new TranslateTransition();
        t12.setNode(island10);
        t12.setDuration(Duration.millis(1000));
        t12.setCycleCount(TranslateTransition.INDEFINITE);
        t12.setByY(-15);
        t12.setAutoReverse(true);
        t12.play();

        TranslateTransition t13 = new TranslateTransition();
        t13.setNode(island11);
        t13.setDuration(Duration.millis(1000));
        t13.setCycleCount(TranslateTransition.INDEFINITE);
        t13.setByY(-15);
        t13.setAutoReverse(true);
        t13.play();

        TranslateTransition t14 = new TranslateTransition();
        t14.setNode(island12);
        t14.setDuration(Duration.millis(1000));
        t14.setCycleCount(TranslateTransition.INDEFINITE);
        t14.setByY(-15);
        t14.setAutoReverse(true);
        t14.play();

        TranslateTransition t15 = new TranslateTransition();
        t15.setNode(island13);
        t15.setDuration(Duration.millis(1000));
        t15.setCycleCount(TranslateTransition.INDEFINITE);
        t15.setByY(-15);
        t15.setAutoReverse(true);
        t15.play();

        TranslateTransition t16 = new TranslateTransition();
        t16.setNode(island14);
        t16.setDuration(Duration.millis(1000));
        t16.setCycleCount(TranslateTransition.INDEFINITE);
        t16.setByY(-15);
        t16.setAutoReverse(true);
        t16.play();

        TranslateTransition t17 = new TranslateTransition();
        t17.setNode(island15);
        t17.setDuration(Duration.millis(1000));
        t17.setCycleCount(TranslateTransition.INDEFINITE);
        t17.setByY(-15);
        t17.setAutoReverse(true);
        t17.play();

        TranslateTransition t18 = new TranslateTransition();
        t18.setNode(island16);
        t18.setDuration(Duration.millis(1000));
        t18.setCycleCount(TranslateTransition.INDEFINITE);
        t18.setByY(-15);
        t18.setAutoReverse(true);
        t18.play();

        TranslateTransition t19 = new TranslateTransition();
        t19.setNode(telepoter);
        t19.setDuration(Duration.millis(1000));
        t19.setCycleCount(TranslateTransition.INDEFINITE);
        t19.setByY(-15);
        t19.setAutoReverse(true);
        t19.play();

        TranslateTransition t6 = new TranslateTransition();
        t6.setNode(chest1);
        t6.setDuration(Duration.millis(1000));
        t6.setCycleCount(TranslateTransition.INDEFINITE);
        t6.setByY(-15);
        t6.setAutoReverse(true);
        t6.play();

        TranslateTransition t24 = new TranslateTransition();
        t24.setNode(chest2);
        t24.setDuration(Duration.millis(1000));
        t24.setCycleCount(TranslateTransition.INDEFINITE);
        t24.setByY(-15);
        t24.setAutoReverse(true);
        t24.play();

        RotateTransition r2 = new RotateTransition();
        r2.setNode(coin1);
        r2.setDuration(Duration.millis(800));
        r2.setCycleCount(RotateTransition.INDEFINITE);
        r2.setByAngle(360);
        r2.setAxis(Rotate.Y_AXIS);
        r2.play();

        RotateTransition r3 = new RotateTransition();
        r3.setNode(coin2);
        r3.setDuration(Duration.millis(800));
        r3.setCycleCount(RotateTransition.INDEFINITE);
        r3.setByAngle(360);
        r3.setAxis(Rotate.Y_AXIS);
        r3.play();

        RotateTransition r4 = new RotateTransition();
        r4.setNode(coin3);
        r4.setDuration(Duration.millis(800));
        r4.setCycleCount(RotateTransition.INDEFINITE);
        r4.setByAngle(360);
        r4.setAxis(Rotate.Y_AXIS);
        r4.play();

        RotateTransition r5 = new RotateTransition();
        r5.setNode(coin4);
        r5.setDuration(Duration.millis(800));
        r5.setCycleCount(RotateTransition.INDEFINITE);
        r5.setByAngle(360);
        r5.setAxis(Rotate.Y_AXIS);
        r5.play();

    }

    private double dy1 = 4;
    private double dy2 = 4;
    private int a = 0;
    private int b1 = 0;
    private int b2 = 0;
     private double time = 22;
    public void collision(){
        time = time*2;
        Timeline timeline1 = new Timeline(new KeyFrame(
                Duration.millis(time),
                (evt) -> {
                    helmet3.setY(helmet3.getY() + dy1);
                    weapon.setY(weapon.getY() + dy2);
                    if(helmet3.getBoundsInParent().intersects(block1.getBoundsInParent())){
                        dy1 = -dy1;
                        dy2 = -dy2;
                    }
                    if(helmet3.getBoundsInParent().intersects(block2.getBoundsInParent())){
                        dy1 = -dy1;
                        dy2 = -dy2;
                    }
                    if(helmet3.getBoundsInParent().intersects(block3.getBoundsInParent())){
                        dy1 = -dy1;
                        dy2 = -dy2;
                    }
                    if(helmet3.getBoundsInParent().intersects(block4.getBoundsInParent())){
                        System.out.println("Game Over");
                        b1++;
                    }
                    if(helmet3.getBoundsInParent().intersects(island1.getBoundsInParent())){
                        dy1 = -dy1;
                        dy2 = -dy2;
                    }
                    if(helmet3.getBoundsInParent().intersects(island2.getBoundsInParent())){
                        dy1 = -dy1;
                        dy2 = -dy2;
                    }
                    if(helmet3.getBoundsInParent().intersects(island3.getBoundsInParent())){
                        dy1 = -dy1;
                        dy2 = -dy2;
                    }
                    if(helmet3.getBoundsInParent().intersects(island5.getBoundsInParent())){
                        dy1 = -dy1;
                        dy2 = -dy2;
                    }
                    if(helmet3.getBoundsInParent().intersects(island6.getBoundsInParent())){
                        dy1 = -dy1;
                        dy2 = -dy2;
                    }
                    if(helmet3.getBoundsInParent().intersects(island7.getBoundsInParent())){
                        dy1 = -dy1;
                        dy2 = -dy2;
                    }
                    if(helmet3.getBoundsInParent().intersects(island8.getBoundsInParent())){
                        dy1 = -dy1;
                        dy2 = -dy2;
                    }
                    if(helmet3.getBoundsInParent().intersects(island9.getBoundsInParent())){
                        dy1 = -dy1;
                        dy2 = -dy2;
                    }
                    if(helmet3.getBoundsInParent().intersects(island10.getBoundsInParent())){
                        dy1 = -dy1;
                        dy2 = -dy2;
                    }
                    if(helmet3.getBoundsInParent().intersects(island11.getBoundsInParent())){
                        dy1 = -dy1;
                        dy2 = -dy2;
                    }
                    if(helmet3.getBoundsInParent().intersects(island12.getBoundsInParent())){
                        dy1 = -dy1;
                        dy2 = -dy2;
                    }
                    if(helmet3.getBoundsInParent().intersects(island13.getBoundsInParent())){
                        dy1 = -dy1;
                        dy2 = -dy2;
                    }
                    if(helmet3.getBoundsInParent().intersects(island14.getBoundsInParent())){
                        dy1 = -dy1;
                        dy2 = -dy2;
                    }
                    if(helmet3.getBoundsInParent().intersects(island15.getBoundsInParent())){
                        dy1 = -dy1;
                        dy2 = -dy2;
                    }
                    if(helmet3.getBoundsInParent().intersects(island16.getBoundsInParent())){
                        dy1 = -dy1;
                        dy2 = -dy2;
                    }
                    if(helmet3.getBoundsInParent().intersects(telepoter.getBoundsInParent())){
                        b2++;
                    }
                    if(helmet3.getBoundsInParent().intersects(chest1.getBoundsInParent())){
                        Image i23 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\ChestOpen.png");
                        chest1.setFill(new ImagePattern(i23));
                        move.setVisible(true);

                        Image i24 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\WeaponAxe.png");
                        weapon.setFill(new ImagePattern(i24));
                        move.setVisible(true);

                        RotateTransition r1 = new RotateTransition();
                        r1.setNode(weapon);
                        r1.setDuration(Duration.millis(800));
                        r1.setCycleCount(RotateTransition.INDEFINITE);
                        r1.setInterpolator(Interpolator.LINEAR);
                        r1.setByAngle(360);
                        r1.setAxis(Rotate.Z_AXIS);
                        r1.play();
                    }
                    if(helmet3.getBoundsInParent().intersects(chest2.getBoundsInParent())){
                        Image i27 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\ChestOpen.png");
                        chest2.setFill(new ImagePattern(i27));
                        move.setVisible(true);
                    }
                    if(helmet3.getBoundsInParent().intersects(chestcoin.getBoundsInParent())){
                        collectChestCoin(chestcoin);
                    }
                    if(weapon.getBoundsInParent().intersects(orccoin1.getBoundsInParent())){
                        collectOrcCoin(orccoin1);
                    }
                    if(weapon.getBoundsInParent().intersects(orccoin2.getBoundsInParent())){
                        collectOrcCoin(orccoin2);
                    }
                    if(weapon.getBoundsInParent().intersects(orccoin3.getBoundsInParent())){
                        collectOrcCoin(orccoin3);
                    }
                    if(weapon.getBoundsInParent().intersects(orccoin4.getBoundsInParent())){
                        collectOrcCoin(orccoin4);
                    }
                    if(weapon.getBoundsInParent().intersects(orc2.getBoundsInParent())){
                        dieOrc(orc2);
                    }
                    if(weapon.getBoundsInParent().intersects(orc3.getBoundsInParent())){
                        dieOrc(orc3);
                    }
                    if(weapon.getBoundsInParent().intersects(orc4.getBoundsInParent())){
                        dieOrc(orc4);
                    }
                    if(weapon.getBoundsInParent().intersects(orc5.getBoundsInParent())){
                        dieOrc(orc5);
                    }
                    if(helmet3.getBoundsInParent().intersects(coin1.getBoundsInParent())){
                        collectCoin(coin1);
                    }
                    if(helmet3.getBoundsInParent().intersects(coin2.getBoundsInParent())){
                        collectCoin(coin2);
                    }
                    if(helmet3.getBoundsInParent().intersects(coin3.getBoundsInParent())){
                        collectCoin(coin3);
                    }
                    if(helmet3.getBoundsInParent().intersects(coin4.getBoundsInParent())){
                        collectCoin(coin4);
                    }
                    if(helmet3.getBoundsInParent().intersects(coin5.getBoundsInParent())){
                        collectCoin(coin5);
                    }
                    if(helmet3.getBoundsInParent().intersects(coin6.getBoundsInParent())){
                        collectCoin(coin6);
                    }
                    if(helmet3.getBoundsInParent().intersects(coin8.getBoundsInParent())){
                        collectCoin(coin8);
                    }
                    if(helmet3.getBoundsInParent().intersects(coin9.getBoundsInParent())){
                        collectCoin(coin9);
                    }
                    if(helmet3.getBoundsInParent().intersects(coin10.getBoundsInParent())){
                        collectCoin(coin10);
                    }
                    if(helmet3.getBoundsInParent().intersects(coin11.getBoundsInParent())){
                        collectCoin(coin11);
                    }
                    if(helmet3.getBoundsInParent().intersects(coin12.getBoundsInParent())){
                        collectCoin(coin12);
                    }
                }
        ));
        timeline1.setCycleCount(Animation.INDEFINITE);
        a++;
        timeline1.play();
    }


    private double dy3 = 4;
    private double time1 = 50;
    public void dieOrc(Rectangle r){
        TranslateTransition t20 = new TranslateTransition();
        t20.setNode(r);
        t20.setDuration(Duration.millis(200));
        t20.setByX(150);
        t20.setAutoReverse(true);
        t20.play();

        Timeline timeline1 = new Timeline(new KeyFrame(
                Duration.millis(time1),
                (evt) -> {
                    r.setY(r.getY() + dy3);
                }
        ));
        timeline1.setCycleCount(Animation.INDEFINITE);
        timeline1.play();
    }

    public void collectCoin(Rectangle r){
        c++;
        r.setY(-1000);
        Paint p = new Color(0,0,0,0);
        r.setFill(p);
        Points.setText("Points ; "+ c);
    }

    public void collectChestCoin(Rectangle r){
        c+=5;
        r.setY(-1000);
        Points.setText("Points ; " + c);
    }

    public void collectOrcCoin(Rectangle r){
        c+=10;
        r.setY(-1000);
        Points.setText("Points ; " + c);
    }

    public void GameOverScene() throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("GameOverScene.fxml")));
        Stage window = (Stage) move.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    public void nextScene() throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene3.fxml")));
        Stage window = (Stage) move.getScene().getWindow();
        window.setScene(new Scene(root));
    }
}

