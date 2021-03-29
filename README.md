# GradientView
![Sample](/screenshot/sample.jpg)
# Import
```
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```
```
implementation 'com.github.mgcoco:GradientView:version'
```
# Usage
#### Xml
```
// Default orientation is vertical
<com.mgcoco.gradientview.GradientView
   android:layout_width="match_parent"
   android:layout_height="match_parent"
   app:gradientColor="@array/colors"
   app:orientation="horizontal"/>
```
```
<color name="color1">#008DE9</color>
<color name="color2">#67CD5B</color>
<color name="color3">#FCBA3E</color>

// Supported 3 colors gradient only
<integer-array name="colors">
    <item>@color/color1</item>
    <item>@color/color2</item>
    <item>@color/color3</item>
</integer-array>
```
```
// x,y control points coordinate
// x and y must 0 <= x,y <= 1
<string-array name="control_point">
    <item>0.1,0</item>
    <item>0.9,0.25</item>
    <item>0.1,0.5</item>
    <item>0.9,0.75</item>
    <item>0.1,1</item>
</string-array>
```
#### Programmatically
```
ArrayList<ControlPoint> controlPoints = new ArrayList<>();
controlPoints.add(new ControlPoint(0f, 0.1f));
controlPoints.add(new ControlPoint(0.25f, 0.9f));
controlPoints.add(new ControlPoint(0.5f, 0.1f));
controlPoints.add(new ControlPoint(0.75f, 0.9f));
controlPoints.add(new ControlPoint(1f, 0.1f));
gradient1.setControlPoints(controlPoints);

gradient1.setOrientation(GradientView.VERTICAL);
gradient1.setGradientColor(new int[]{Color.RED, Color.YELLOW, Color.GREEN});
```
