package hw2;

import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * This displays mew (a special cat) to a scene.
 *
 * @author Lennox Haynes
 */

public class Mew extends Application {

    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        final int SCENE_WIDTH = 700;
        final int SCENE_HEIGHT = 700;
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.LIGHTGREY);

        // Make the color of Mews color
        Color color1 = Color.rgb(246, 217, 222, 1);

        // Create a head for Mew
        // Face Shape
        Ellipse head = new Ellipse(55, 80);
        head.setRotate(5);

        // LEFT CHEEK
        Ellipse leftCheek = new Ellipse(80, 55);
        leftCheek.setRotate(-27);
        leftCheek.setTranslateX(-15);

        Ellipse leftCheek2 = new Ellipse(63, 25);
        leftCheek2.setRotate(-40);
        leftCheek2.setTranslateX(-34.5);
        leftCheek2.setTranslateY(-35);

        // RIGHT CHEEK
        Ellipse rightCheek = new Ellipse(80, 55);
        rightCheek.setRotate(15);
        rightCheek.setTranslateX(15);

        Ellipse rightCheek2 = new Ellipse(63, 30);
        rightCheek2.setRotate(52);
        rightCheek2.setTranslateX(40);
        rightCheek2.setTranslateY(-26);

        // MOUTH
        Line leftMouthLine = new Line(0, 0, 0, 5);
        leftMouthLine.setStrokeWidth(2);
        leftMouthLine.setRotate(-45);
        leftMouthLine.setTranslateX(-114);
        leftMouthLine.setTranslateY(-39);

        Line rightMouthLine = new Line(0, 0, 0, 5);
        rightMouthLine.setStrokeWidth(2);
        rightMouthLine.setRotate(23);
        rightMouthLine.setTranslateX(-39);
        rightMouthLine.setTranslateY(-51);

        // Make eyes for Mew
        // LEFT EYE
        Polygon leftEye = new Polygon(0, 0, 55, 0, 0, -45);

        // LEFT EYE ARCS
        Arc topLeftEyeArc = new Arc(0, 0, 38, 15,
                -180, 150);
        topLeftEyeArc.setRotate(-146);
        topLeftEyeArc.setTranslateX(31);
        topLeftEyeArc.setTranslateY(-33);

        Arc bottomLeftEyeArc = new Arc(0, 0, 29, 15,
                -180, 150);
        bottomLeftEyeArc.setRotate(-6);
        bottomLeftEyeArc.setTranslateX(30);
        bottomLeftEyeArc.setTranslateY(-5);

        // LEFT EYEBROW
        Line leftEyebrow = new Line(0, 0, 0, 15);
        leftEyebrow.setStrokeWidth(1.5);
        leftEyebrow.setRotate(-18);
        leftEyebrow.setTranslateX(-90);
        leftEyebrow.setTranslateY(-111);

        // RIGHT EYE
        Polygon rightEye = new Polygon(0, 0, -55, 0, 0, -45);

        // RIGHT EYE ARCS
        Arc topRightEyeArc = new Arc(0, 0, 38, 15,
                -180, 150);
        topRightEyeArc.setRotate(135);
        topRightEyeArc.setTranslateX(-27.5);
        topRightEyeArc.setTranslateY(-32);

        Arc bottomRightEyeArc = new Arc(0, 0, 28.5, 15,
                -180, 150);
        bottomRightEyeArc.setRotate(-5.5);
        bottomRightEyeArc.setTranslateX(-25.5);
        bottomRightEyeArc.setTranslateY(-5);

        // RIGHT EYEBROW
        Line rightEyebrow = new Line(0, 0, 0, 15);
        rightEyebrow.setStrokeWidth(1.5);
        rightEyebrow.setRotate(10);
        rightEyebrow.setTranslateX(-67);
        rightEyebrow.setTranslateY(-113);

        // Create Ears for Mew
        // LEFT EAR
        Polygon leftEar = new Polygon(70, 70, 40, -50, -50, 40);
        leftEar.setRotate(-177);
        leftEar.setTranslateX(-47);
        leftEar.setTranslateY(-20);

        //LEFT EAR ARCS
        Arc lLeftEarArc = new Arc(0, 0, 39.5, 15,
                -180, 150);
        lLeftEarArc.setRotate(73);
        lLeftEarArc.setTranslateX(-85.4);
        lLeftEarArc.setTranslateY(-43);

        Arc rLeftEarArc = new Arc(0, 0, 39, 15, 180,
                150);
        rLeftEarArc.setRotate(201);
        rLeftEarArc.setTranslateX(-55);
        rLeftEarArc.setTranslateY(-67);

        // RIGHT EAR
        Polygon rightEar = new Polygon(70, 70, 40, -50, -50, 40);
        rightEar.setRotate(-90);
        rightEar.setTranslateX(25);
        rightEar.setTranslateY(-20);

        // RIGHT EAR ARCS
        Arc lRightEarArc = new Arc(0, 0, 34, 13, -180,
                150);
        lRightEarArc.setRotate(159.5);
        lRightEarArc.setTranslateX(66);
        lRightEarArc.setTranslateY(-70.5);

        Arc rRightEarArc = new Arc(0, 0, 34, 13, -180,
                150);
        rRightEarArc.setRotate(-78);
        rRightEarArc.setTranslateX(91);
        rRightEarArc.setTranslateY(-46);

        // Create a body for Mew
        // CHEST
        Ellipse chest = new Ellipse(65, 40);
        chest.setRotate(80);
        chest.setTranslateX(-65);
        chest.setTranslateY(45);

        // Rectangle connecting the chest to the head
        Rectangle chestRect = new Rectangle(50, 70);
        chestRect.setRotate(-15);
        chestRect.setTranslateX(-100);
        chestRect.setTranslateY(-40);

        // STOMACH
        Circle stomach = new Circle(40, color1);
        stomach.setStroke(Color.BLACK);
        stomach.setStrokeWidth(2);
        stomach.setRotate(20);
        stomach.setTranslateX(-57);
        stomach.setTranslateY(100);

        // Creates Arms for Mew
        // LEFT ARM
        Ellipse leftArm = new Ellipse(55, 15);
        leftArm.setRotate(-20);
        leftArm.setTranslateX(-130);
        leftArm.setTranslateY(10);

        // RIGHT ARM
        Ellipse rightArm = new Ellipse(55, 15);
        rightArm.setRotate(10);
        rightArm.setTranslateX(-20);
        rightArm.setTranslateY(-4);

        // FINGERS
        Polygon finger1 = new Polygon(8, 8, 5, -6, -6, 5);
        finger1.setTranslateX(0);
        finger1.setTranslateY(0);

        Polygon finger2 = new Polygon(8, 8, 5, -6, -6, 5);
        finger2.setTranslateX(0);
        finger2.setTranslateY(0);

        // LEGS
        // LEFT LEG
        Circle leftLeg = new Circle(40, color1);
        leftLeg.setFill(color1);
        leftLeg.setStroke(Color.BLACK);
        leftLeg.setStrokeWidth(2);
        leftLeg.setTranslateX(-80);
        leftLeg.setTranslateY(88);

        // LEFT FOOT
        Ellipse leftFoot = new Ellipse(20, 60);
        leftFoot.setFill(color1);
        leftFoot.setStroke(Color.BLACK);
        leftFoot.setStrokeWidth(2);
        leftFoot.setRotate(-5);
        leftFoot.setTranslateX(-105);
        leftFoot.setTranslateY(155);

        // LEFT TOES
        Line leftToeLine1 = new Line(0, 0, 0, 15);
        leftToeLine1.setStrokeWidth(2);
        leftToeLine1.setRotate(-7);
        leftToeLine1.setTranslateX(-107);
        leftToeLine1.setTranslateY(203);

        Line leftToeLine2 = new Line(0, 0, 0, 15);
        leftToeLine2.setStrokeWidth(2);
        leftToeLine2.setRotate(-7);
        leftToeLine2.setTranslateX(-97);
        leftToeLine2.setTranslateY(203);

        // RIGHT LEG
        Ellipse rightLeg = new Ellipse(26, 50);
        rightLeg.setRotate(-20);
        rightLeg.setTranslateX(-28);
        rightLeg.setTranslateY(95);

        // RIGHT FOOT
        Ellipse rightFoot = new Ellipse(20, 70);
        rightFoot.setRotate(-8);
        rightFoot.setTranslateX(4);
        rightFoot.setTranslateY(190);

        // RIGHT TOES
        Line rightToeLine1 = new Line(0, 0, 0, 15);
        rightToeLine1.setStrokeWidth(2);
        rightToeLine1.setRotate(-10);
        rightToeLine1.setTranslateX(7);
        rightToeLine1.setTranslateY(247);

        Line rightToeLine2 = new Line(0, 0, 0, 14);
        rightToeLine2.setStrokeWidth(2);
        rightToeLine2.setRotate(-9);
        rightToeLine2.setTranslateX(19);
        rightToeLine2.setTranslateY(243.5);

        // Create a tail for mew
        // BOTTOM ARC OF TAIL
        Ellipse bottomTailArc = new Ellipse(100, 83);
        bottomTailArc.setFill(color1.darker());
        bottomTailArc.setStroke(Color.BLACK);
        bottomTailArc.setStrokeWidth(2);
        bottomTailArc.setTranslateX(3);
        bottomTailArc.setTranslateY(29);

        Ellipse insideBottomTailArc = new Ellipse(90, 70);
        insideBottomTailArc.setFill(Color.LIGHTGREY);
        insideBottomTailArc.setStroke(Color.BLACK);
        insideBottomTailArc.setStrokeWidth(2);
        insideBottomTailArc.setTranslateY(30);

        // TOP ARC OF TAIL
        Ellipse topTailArc = new Ellipse(120, 100);
        topTailArc.setFill(color1.darker());
        topTailArc.setStroke(Color.BLACK);
        topTailArc.setStrokeWidth(2);
        topTailArc.setRotate(-20);
        topTailArc.setTranslateX(-122);
        topTailArc.setTranslateY(-110);

        Ellipse insideTopTailArc = new Ellipse(110, 87);
        insideTopTailArc.setFill(Color.LIGHTGREY);
        insideTopTailArc.setStroke(Color.BLACK);
        insideTopTailArc.setStrokeWidth(2);
        insideTopTailArc.setRotate(-20);
        insideTopTailArc.setTranslateX(-120);
        insideTopTailArc.setTranslateY(-110);

        // Removes the needed top tail part of ellipse
        Rectangle rectTopTailArc = new Rectangle(300, 40);
        rectTopTailArc.setFill(Color.LIGHTGREY);
        rectTopTailArc.setRotate(10);
        rectTopTailArc.setTranslateX(-150);
        rectTopTailArc.setTranslateY(-203);

        // TAIL TIP
        Ellipse tailTip = new Ellipse(60, 20);
        tailTip.setFill(color1.darker());
        tailTip.setStroke(Color.BLACK);
        tailTip.setStrokeWidth(2);
        tailTip.setRotate(-21);
        tailTip.setTranslateX(-132.5);
        tailTip.setTranslateY(-200);

        // Create a rectangle to connect the tip to the tail
        Rectangle tailRect = new Rectangle(30, 12, color1.darker());
        tailRect.setRotate(-31.5);
        tailRect.setTranslateX(-177);
        tailRect.setTranslateY(-186);

        // BODY PARTS
        // HEAD
        Shape mewsHead = Shape.union(leftCheek, rightCheek);
        mewsHead = Shape.union(mewsHead, head);
        mewsHead = Shape.union(mewsHead, leftCheek2);
        mewsHead = Shape.union(mewsHead, rightCheek2);
        mewsHead = Shape.union(mewsHead, leftEar);
        mewsHead = Shape.union(mewsHead, lLeftEarArc);
        mewsHead = Shape.union(mewsHead, rLeftEarArc);
        mewsHead = Shape.union(mewsHead, rightEar);
        mewsHead = Shape.union(mewsHead, rRightEarArc);
        mewsHead = Shape.union(mewsHead, lRightEarArc);
        mewsHead.setFill(color1);
        mewsHead.setStroke(Color.BLACK);
        mewsHead.setStrokeWidth(2);
        mewsHead.setRotate(-7);
        mewsHead.setTranslateX(-82.5);
        mewsHead.setTranslateY(-102);

        // EYES
        // LEFT
        Shape mewsLeftEye = Shape.union(leftEye, topLeftEyeArc);
        mewsLeftEye = Shape.union(mewsLeftEye, bottomLeftEyeArc);
        mewsLeftEye.setFill(Color.SNOW);
        mewsLeftEye.setStroke(Color.BLACK);
        mewsLeftEye.setStrokeWidth(2);
        mewsLeftEye.setStrokeLineJoin(StrokeLineJoin.ROUND);
        mewsLeftEye.setRotate(-4);
        mewsLeftEye.setTranslateX(-121);
        mewsLeftEye.setTranslateY(-103);

        Ellipse leftEyeEllipse = new Ellipse(7, 15);
        leftEyeEllipse.setFill(Color.rgb(76, 127, 179, 1));
        leftEyeEllipse.setStroke(Color.BLACK);
        leftEyeEllipse.setStrokeWidth(1);
        leftEyeEllipse.setRotate(-5);
        leftEyeEllipse.setTranslateX(-119);
        leftEyeEllipse.setTranslateY(-99);

        Ellipse leftEyeEllipse2 = new Ellipse(4, 9);
        leftEyeEllipse2.setFill(Color.rgb(65, 68, 77, 1));
        leftEyeEllipse2.setRotate(-5);
        leftEyeEllipse2.setTranslateX(-118);
        leftEyeEllipse2.setTranslateY(-98.5);

        // RIGHT
        Shape mewsRightEye = Shape.union(rightEye, topRightEyeArc);
        mewsRightEye = Shape.union(mewsRightEye, bottomRightEyeArc);
        mewsRightEye.setFill(Color.SNOW);
        mewsRightEye.setStroke(Color.BLACK);
        mewsRightEye.setStrokeWidth(2);
        mewsRightEye.setStrokeLineJoin(StrokeLineJoin.ROUND);
        mewsRightEye.setRotate(-7);
        mewsRightEye.setTranslateX(-38);
        mewsRightEye.setTranslateY(-111);

        Ellipse rightEyeEllipse = new Ellipse(7, 15);
        rightEyeEllipse.setFill(Color.rgb(76, 127, 179, 1));
        rightEyeEllipse.setStroke(Color.BLACK);
        rightEyeEllipse.setStrokeWidth(1);
        rightEyeEllipse.setRotate(-5);
        rightEyeEllipse.setTranslateX(-31);
        rightEyeEllipse.setTranslateY(-108);

        Ellipse rightEyeEllipse2 = new Ellipse(4, 9);
        rightEyeEllipse2.setFill(Color.rgb(65, 68, 77, 1));
        rightEyeEllipse2.setRotate(-5);
        rightEyeEllipse2.setTranslateX(-30);
        rightEyeEllipse2.setTranslateY(-107.5);

        // BODY
        Shape mewsBody = Shape.union(chest, stomach);
        mewsBody = Shape.union(mewsBody, chestRect);
        mewsBody = Shape.union(mewsBody, leftArm);
        mewsBody = Shape.union(mewsBody, rightArm);
        mewsBody.setFill(color1);
        mewsBody.setStroke(Color.BLACK);
        mewsBody.setStrokeWidth(2);
        mewsBody.setRotate(5);
        mewsBody.setTranslateX(-73.5);
        mewsBody.setTranslateY(40);

        // RIGHT LEG
        Shape mewsRightLegFoot = Shape.union(rightLeg, rightFoot);
        mewsRightLegFoot.setFill(color1);
        mewsRightLegFoot.setStroke(Color.BLACK);
        mewsRightLegFoot.setStrokeWidth(2);
        mewsRightLegFoot.setTranslateX(-16);
        mewsRightLegFoot.setTranslateY(152);

        // ADD DROP SHADOW TO MEW
        DropShadow shadow = new DropShadow();
        shadow.setOffsetX(-1.5);
        shadow.setOffsetY(5.0);
        shadow.setColor(Color.BLACK);

        // Caption on the bottom of the scene
        Text text = new Text("IT'S MEW!");
        Font textFont = Font.font("SansSerif", FontWeight.BOLD, FontPosture.ITALIC,
                25);
        text.setFont(textFont);
        text.setFill(color1.darker());
        text.setStroke(Color.BLACK);
        text.setStrokeWidth(1);
        text.setTranslateX(75);
        text.setTranslateY(-195);

        // Apply the Drop Shadow effect to mew
        mewsHead.setEffect(shadow);
        mewsBody.setEffect(shadow);
        mewsRightLegFoot.setEffect(shadow);
        topTailArc.setEffect(shadow);
        bottomTailArc.setEffect(shadow);
        text.setEffect(shadow);

        // Adds the floating look to mew
        Ellipse floorShadow = new Ellipse(100, 10);
        floorShadow.setFill(Color.DARKGREY.darker());
        floorShadow.setRotate(4);
        floorShadow.setTranslateX(-60);
        floorShadow.setTranslateY(275);

        // ANIMATIONS
        TranslateTransition transition = new TranslateTransition(Duration.seconds(1.3),
                root);
        transition.setByX(-10);
        transition.setToY(-12);
        transition.setAutoReverse(true);
        transition.setCycleCount(TranslateTransition.INDEFINITE);
        transition.play();

        //ScaleTransition mew
        ScaleTransition mewsTransition = new ScaleTransition(Duration.seconds(1.3),
                root);
        mewsTransition.setToX(1.15);
        mewsTransition.setToY(1.15);
        mewsTransition.setAutoReverse(true);
        mewsTransition.setCycleCount(TranslateTransition.INDEFINITE);
        mewsTransition.play();

        ScaleTransition shadowTransition = new ScaleTransition(Duration.seconds(1.3),
                floorShadow);
        shadowTransition.setToX(.25);
        shadowTransition.setToX(.25);
        shadowTransition.setAutoReverse(true);
        shadowTransition.setCycleCount(TranslateTransition.INDEFINITE);
        shadowTransition.play();

        // Remove Unneeded Lines From Mew
        // RIGHT LEG CLEAN-UP
        Ellipse rightLegFix = new Ellipse(17, 40);
        rightLegFix.setFill(color1);
        rightLegFix.setTranslateX(-38);
        rightLegFix.setTranslateY(52);

        // LEFT LEG CLEAN-UP
        Ellipse leftLegFix = new Ellipse(15, 60);
        leftLegFix.setFill(color1);
        leftLegFix.setTranslateX(-92);
        leftLegFix.setTranslateY(62);

        Ellipse leftLegFix2 = new Ellipse(15, 45);
        leftLegFix2.setFill(color1);
        leftLegFix2.setTranslateX(-101);
        leftLegFix2.setTranslateY(102);

        // STOMACH CLEAN-UP
        Rectangle stomachRect = new Rectangle(20, 80);
        stomachRect.setFill(color1);
        stomachRect.setTranslateX(-57);
        stomachRect.setTranslateY(90);

        Line leftStomachLine = new Line(0, 0, 0, 43);
        leftStomachLine.setStrokeWidth(2);
        leftStomachLine.setRotate(5.6);
        leftStomachLine.setTranslateX(-107);
        leftStomachLine.setTranslateY(47);

        Line rightStomachLine = new Line(0, 0, 0, 38);
        rightStomachLine.setStrokeWidth(2);
        rightStomachLine.setRotate(-12.6);
        rightStomachLine.setTranslateX(-23);
        rightStomachLine.setTranslateY(38);

        root.getChildren().addAll(topTailArc, insideTopTailArc, rectTopTailArc,
                bottomTailArc, insideBottomTailArc, tailTip, tailRect, floorShadow,
                leftFoot, leftLeg, leftToeLine1, leftToeLine2, mewsBody, mewsHead,
                leftMouthLine, rightMouthLine, mewsRightLegFoot, rightToeLine1,
                rightToeLine2, leftLegFix, leftLegFix2, rightLegFix, rightStomachLine,
                leftStomachLine, stomachRect, mewsLeftEye, leftEyeEllipse,
                leftEyeEllipse2, mewsRightEye, rightEyeEllipse, rightEyeEllipse2,
                leftEyebrow, rightEyebrow, text);

        primaryStage.setScene(scene);
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setTitle("Angry Mew Appeared");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
