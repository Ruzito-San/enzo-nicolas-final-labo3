import jdk.dynalink.linker.TypeBasedGuardingDynamicLinker;

import javax.sound.sampled.Control;
import javax.sound.sampled.Port;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class GestionGenerica<T extends Object>{


    List list;

    public GestionGenerica() {
        this.list = new LinkedList<T>();
    }

    public void ADD(T dato){
        this.list.add(dato);
    }


    public StringBuilder getInfo(String datoBuscado){
        StringBuilder sb = new StringBuilder();
        int op =0;
        boolean flag=false;
        try {
            for (  int i =0;i< list.size();i++){

                if(list.get(i).getClass() == Computadora.class  ){
                    op=1;
                } else if (list.get(i).getClass() == Telefono.class) {
                    op=2;
                } else if (list.get(i).getClass() == Accesorio.class) {
                    op=3;
                }
                switch (op){
                    case 1:
                        Computadora compu = (Computadora) list.get(i);
                        if(compu.name.equals(datoBuscado)){
                            sb.append(compu.toString());
                            flag=true;
                        }
                        break;
                    case 2:
                        Telefono tel = (Telefono) list.get(i);
                        if(tel.name.equals(datoBuscado)){

                            sb.append(tel.toString());
                            flag=true;
                        }
                        break;
                    case 3:
                        Accesorio acc = (Accesorio) list.get(i);
                        if(acc.name.equals(datoBuscado)){
                            sb.append(acc.toString());
                            flag=true;
                        }
                        break;
                }
            }

            if(flag==false){
                throw new ProdNotFoundException("dato no encontrado");
            }
        }
        catch (ProdNotFoundException e){
            e.getMessage();
            sb.append("dato no encontrado");
        }
        return sb;
    }


    public StringBuilder GetAllInfo(){
        StringBuilder sb = new StringBuilder();

        for (int i=0;i<list.size();i++){
            ProdElectronico temporal = (ProdElectronico) list.get(i);
            sb.append(temporal.toString());
            sb.append("\n");
        }
        return sb;
    }

    public boolean Delete(String datoABorrar){
        boolean condicion=false;
        int op=0;
        for (  int i =0;i< list.size();i++){

            if(list.get(i).getClass() == Computadora.class  ){
                op=1;
            } else if (list.get(i).getClass() == Telefono.class) {
                op=2;
            } else if (list.get(i).getClass() == Accesorio.class) {
                op=3;
            }
            switch (op){
                case 1:
                    Computadora compu = (Computadora) list.get(i);
                    if(compu.name.equals(datoABorrar)){
                        list.remove(i);
                    }
                    break;
                case 2:
                    Telefono tel = (Telefono) list.get(i);
                    if(tel.name.equals(datoABorrar)){
                        list.remove(i);
                    }
                    break;
                case 3:
                    Accesorio acc = (Accesorio) list.get(i);
                    if(acc.name.equals(datoABorrar)){
                        list.remove(i);
                    }
                    break;
            }

        }
        return condicion;
    }

}
