package gameframe;

import java.awt.*;
import java.awt.image.ImageObserver;

interface IGraphicsBuilder {

    void applyModelToGraphic(Graphics graphics, ImageObserver observer);
    int getGlobalWidth();
    int getGlobalHeight();

}