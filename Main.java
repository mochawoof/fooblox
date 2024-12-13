import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.*;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.system.AppSettings;
import com.jme3.light.*;
 
public class Main extends SimpleApplication {
    public static void main(String[] args) {
        Main app = new Main();
 
        AppSettings settings = new AppSettings(true);
        settings.setTitle("Fooblox");
        settings.setResolution(800, 600);
        settings.setGammaCorrection(true);
        
        app.setSettings(settings);
        app.setShowSettings(true);
 
        app.start();
    }
 
    @Override
    public void simpleInitApp() {
        DirectionalLight sun = new DirectionalLight();
        sun.setColor(ColorRGBA.White);
        sun.setDirection(new Vector3f(-0.25f, -0.5f, -0.5f));
        rootNode.addLight(sun);
        
        Box b = new Box(1, 1, 1);
        Geometry geom = new Geometry("Box", b);
 
        Material mat = new Material(assetManager, "Common/MatDefs/Light/Lighting.j3md");
        mat.setBoolean("UseMaterialColors", true);
        mat.setColor("Ambient", ColorRGBA.Blue);
        mat.setColor("Diffuse", ColorRGBA.Blue);
        geom.setMaterial(mat);
 
        rootNode.attachChild(geom);
    }
 
    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }
}