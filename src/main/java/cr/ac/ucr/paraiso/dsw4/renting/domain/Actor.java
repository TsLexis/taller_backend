package cr.ac.ucr.paraiso.dsw4.renting.domain;

import jakarta.persistence.*;

@Entity
@Table (name = "actores")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actor_id")
    private int actorId;

    @Column(name = "nombre_actor")
    private String nombreActor;

    @Column(name = "apellido_actor")
    private String apellidoActor;

    public Actor(){
        
    }

    public Actor(int actorId, String nombreActor, String apellidoActor) {
        this.actorId = actorId;
        this.nombreActor = nombreActor;
        this.apellidoActor = apellidoActor;
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }


    public String getNombreActor() {
        return nombreActor;
    }

    public void setNombreActor(String nombreActor) {
        this.nombreActor = nombreActor;
    }

    public String getApellidoActor() {
        return apellidoActor;
    }

    public void setApellidoActor(String apellidoActor) {
        this.apellidoActor = apellidoActor;
    }
    
    
    

}
