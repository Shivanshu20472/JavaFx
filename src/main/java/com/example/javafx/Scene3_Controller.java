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
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Scene3_Controller implements Initializable {

    int n = 70;

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
    private Label Location;

    @FXML
    private Label Points;

    @FXML
    private Rectangle helmet3;

    @FXML
    private Rectangle weapon;

    @FXML
    private Button move;

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
    private Rectangle island6;

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
    private Rectangle bossOrc;

    @FXML
    private Rectangle orc1;

    @FXML
    private Rectangle orc2;

    @FXML
    private Rectangle orc3;

    @FXML
    private Rectangle block1;

    @FXML
    private Rectangle block2;

    @FXML
    private Rectangle chest1;

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
    private Rectangle orccoin1;

    @FXML
    private Rectangle orccoin2;

    @FXML
    private Rectangle orccoin3;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imageShow();
        animation();
        collision();
    }

    public void right() throws IOException {
        n++;
        if(n<=73){
            helmet3.setX(z1+=80);
            weapon.setX(z14+=80);
        }

        if(b1>0){
            winGame();
        }
        if(b2>0){
            GameOverScene();
        }
        Location.setText("Location : " + n);

        island1.setX(z2+=-80);
        island2.setX(z3+=-80);
        island3.setX(z4+=-80);
        island4.setX(z5+=-80);
        island5.setX(z6+=-80);
        island6.setX(z7+=-80);
        island7.setX(z8+=-80);
        island8.setX(z9+=-80);
        island9.setX(z10+=-80);
        island10.setX(z11+=-80);
        island11.setX(z12+=-80);
        bossOrc.setX(z13+=-80);
        block1.setX(z15+=-80);
        block2.setX(z16+=-80);
        chest1.setX(z17+=-80);
        orc1.setX(z18+=-80);
        orc2.setX(z19+=-80);
        orc3.setX(z20+=-80);
        coin1.setX(z21+=-80);
        coin2.setX(z22+=-80);
        orccoin1.setX(z23+=-80);
        orccoin2.setX(z24+=-80);
        orccoin3.setX(z25+=-80);
    }

    public void imageShow(){
        Image i1 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands1.png");
        island1.setFill(new ImagePattern(i1));
        move.setVisible(true);

        Image i2 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands2.png");
        island2.setFill(new ImagePattern(i2));
        move.setVisible(true);

        Image i3 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands3.png");
        island3.setFill(new ImagePattern(i3));
        move.setVisible(true);

        Image i4 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands4.png");
        island4.setFill(new ImagePattern(i4));
        move.setVisible(true);

        Image i5 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands5.png");
        island5.setFill(new ImagePattern(i5));
        move.setVisible(true);

        Image i6 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands6.png");
        island6.setFill(new ImagePattern(i6));
        move.setVisible(true);

        Image i7 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands7.png");
        island7.setFill(new ImagePattern(i7));
        move.setVisible(true);

        Image i8 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands8.png");
        island8.setFill(new ImagePattern(i8));
        move.setVisible(true);

        Image i9 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands9.png");
        island9.setFill(new ImagePattern(i9));
        move.setVisible(true);

        Image i10 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands10.png");
        island10.setFill(new ImagePattern(i10));
        move.setVisible(true);

        Image i11 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Islands11.png");
        island11.setFill(new ImagePattern(i11));
        move.setVisible(true);

        Image i12 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Helmet3.png");
        helmet3.setFill(new ImagePattern(i12));
        move.setVisible(true);

        Image i13 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\RedOrc1.png");
        bossOrc.setFill(new ImagePattern(i13));
        move.setVisible(true);

        Image i14 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\WeaponAxe.png");
        weapon.setFill(new ImagePattern(i14));
        move.setVisible(true);

        Image i15 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\ChestClosed.png");
        chest1.setFill(new ImagePattern(i15));
        move.setVisible(true);

        Image i16 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Orc1.png");
        orc1.setFill(new ImagePattern(i16));
        move.setVisible(true);

        Image i17 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Orc2.png");
        orc2.setFill(new ImagePattern(i17));
        move.setVisible(true);

        Image i18 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Orc3.png");
        orc3.setFill(new ImagePattern(i18));
        move.setVisible(true);

        Image i19 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\Coin.png");
        coin1.setFill(new ImagePattern(i19));
        coin2.setFill(new ImagePattern(i19));
        coin3.setFill(new ImagePattern(i19));
        coin4.setFill(new ImagePattern(i19));
        coin5.setFill(new ImagePattern(i19));
    }

    public void animation(){

        TranslateTransition t2 = new TranslateTransition();
        t2.setNode(orc1);
        t2.setDuration(Duration.millis(1000));
        t2.setCycleCount(TranslateTransition.INDEFINITE);
        t2.setByY(-15);
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
        t22.setNode(bossOrc);
        t22.setDuration(Duration.millis(1000));
        t22.setCycleCount(TranslateTransition.INDEFINITE);
        t22.setByY(-15);
        t22.setAutoReverse(true);
        t22.play();

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

        TranslateTransition t1 = new TranslateTransition();
        t1.setNode(island4);
        t1.setDuration(Duration.millis(1000));
        t1.setCycleCount(TranslateTransition.INDEFINITE);
        t1.setByY(-15);
        t1.setAutoReverse(true);
        t1.play();

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

        TranslateTransition t6 = new TranslateTransition();
        t6.setNode(chest1);
        t6.setDuration(Duration.millis(1000));
        t6.setCycleCount(TranslateTransition.INDEFINITE);
        t6.setByY(-15);
        t6.setAutoReverse(true);
        t6.play();

        RotateTransition r2 = new RotateTransition();
        r2.setNode(weapon);
        r2.setDuration(Duration.millis(800));
        r2.setCycleCount(RotateTransition.INDEFINITE);
        r2.setInterpolator(Interpolator.LINEAR);
        r2.setByAngle(360);
        r2.setAxis(Rotate.Z_AXIS);
        r2.play();

        RotateTransition r3 = new RotateTransition();
        r3.setNode(coin1);
        r3.setDuration(Duration.millis(800));
        r3.setCycleCount(RotateTransition.INDEFINITE);
        r3.setByAngle(360);
        r3.setAxis(Rotate.Y_AXIS);
        r3.play();

        RotateTransition r4 = new RotateTransition();
        r4.setNode(coin2);
        r4.setDuration(Duration.millis(800));
        r4.setCycleCount(RotateTransition.INDEFINITE);
        r4.setByAngle(360);
        r4.setAxis(Rotate.Y_AXIS);
        r4.play();

        RotateTransition r5 = new RotateTransition();
        r5.setNode(coin3);
        r5.setDuration(Duration.millis(800));
        r5.setCycleCount(RotateTransition.INDEFINITE);
        r5.setByAngle(360);
        r5.setAxis(Rotate.Y_AXIS);
        r5.play();

        RotateTransition r6 = new RotateTransition();
        r6.setNode(coin4);
        r6.setDuration(Duration.millis(800));
        r6.setCycleCount(RotateTransition.INDEFINITE);
        r6.setByAngle(360);
        r6.setAxis(Rotate.Y_AXIS);
        r6.play();

        RotateTransition r7 = new RotateTransition();
        r7.setNode(coin5);
        r7.setDuration(Duration.millis(800));
        r7.setCycleCount(RotateTransition.INDEFINITE);
        r7.setByAngle(360);
        r7.setAxis(Rotate.Y_AXIS);
        r7.play();

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
                        System.out.println("Game Over");
                        b2++;
                    }
                    if(bossOrc.getBoundsInParent().intersects(block2.getBoundsInParent())){
                        b1++;
                    }
                    if(helmet3.getBoundsInParent().intersects(chest1.getBoundsInParent())){
                        Image i16 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\ChestOpen.png");
                        chest1.setFill(new ImagePattern(i16));
                        move.setVisible(true);

                        Image i17 = new Image("C:\\Users\\Shivanshu\\IdeaProjects\\JavaFx\\src\\main\\java\\com\\example\\javafx\\assets\\WeaponSword.png");
                        weapon.setFill(new ImagePattern(i17));
                        move.setVisible(true);
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
                    if(helmet3.getBoundsInParent().intersects(island4.getBoundsInParent())){
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
                    if(weapon.getBoundsInParent().intersects(orc1.getBoundsInParent())){
                        dieOrc(orc1);
                    }
                    if(weapon.getBoundsInParent().intersects(orc2.getBoundsInParent())){
                        dieOrc(orc2);
                    }
                    if(weapon.getBoundsInParent().intersects(orc3.getBoundsInParent())){
                        dieOrc(orc3);
                    }
                    if(weapon.getBoundsInParent().intersects(bossOrc.getBoundsInParent())){
                        dieBossOrc(bossOrc);
                    }
                    if(weapon.getBoundsInParent().intersects(coin1.getBoundsInParent())){
                        collectCoin(coin1);
                    }
                    if(weapon.getBoundsInParent().intersects(coin2.getBoundsInParent())){
                        collectCoin(coin2);
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

    private double dy4 = 4;
    private double time2 = 20;
    public void dieBossOrc(Rectangle r){
        TranslateTransition t23 = new TranslateTransition();
        t23.setNode(r);
        t23.setDuration(Duration.millis(200));
        t23.setByX(300);
        t23.setAutoReverse(true);
        t23.play();

        Timeline timeline2 = new Timeline(new KeyFrame(
                Duration.millis(time2),
                (evt) -> {
                    r.setY(r.getY() + dy4);
                }
        ));
        timeline2.setCycleCount(Animation.INDEFINITE);
        timeline2.play();
    }

    public void winGame() throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("WinGame.fxml")));
        Stage window = (Stage) move.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void GameOverScene() throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("GameOverScene.fxml")));
        Stage window = (Stage) move.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    static Controller2 c1 = new Controller2();
    static int a1 = c1.c;
    public void collectCoin(Rectangle r){
        a1+=1;
        r.setY(-1000);
        Points.setText("Points ; " + a1);
    }

    public void collectOrcCoin(Rectangle r){
        a1+=10;
        r.setY(-1000);
        Points.setText("Points ; " + a1);
    }
}
