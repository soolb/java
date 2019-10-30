package Clases;

public class Producto {

    private String _nombre;
    private String _color;
    private int _precio;
    private int _idImagen;
    private String _descripcion;

    
    public Producto(String nombre, int precio, int idImagen) {
        this._nombre = nombre;
        this._precio = precio;        
        this._idImagen = idImagen;
    }

    public int getIdImagen() {
        return _idImagen;
    }

    public void setIdImagen(int _idImagen) {
        this._idImagen = _idImagen;
    }
    
    
    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String _color) {
        this._color = _color;
    }

    public int getPrecio() {
        return _precio;
    }

    public void setPrecio(int _precio) {
        this._precio = _precio;
    }


    public String getDescripcion() {
        return _descripcion;
    }

    public void setDescripcion(String _descripcion) {
        this._descripcion = _descripcion;
    }
    
    
}
