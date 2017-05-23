
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class tablasController {

	@FXML
	private ListView<String> LVCandidates;

	@FXML
	private ListView<String> LVSelected;

	@FXML
	private Button cambioDerecha;

	@FXML
	private Button cambioIzquierda;

	private ObservableList<String> data = FXCollections.observableArrayList("a", "b", "c");
	private ObservableList<String> data2 = FXCollections.observableArrayList();

	public void initialize() {
		LVCandidates.setItems(this.data);
		LVSelected.setItems(this.data2);

	}

	public void CambioDerecha(ActionEvent event) {
		String uno = (String) LVCandidates.getSelectionModel().getSelectedItem();

		if (uno.isEmpty()) {

		} else {
			data.remove((String) LVCandidates.getSelectionModel().getSelectedItem());
			data2.add(uno);
			LVCandidates.setItems(this.data);
			LVSelected.setItems(this.data2);
		}

	}

	public void CambioIzquierda(ActionEvent event) {

		String dos = (String) LVSelected.getSelectionModel().getSelectedItem();
		if (dos.isEmpty()) {

		} else {
			data.add(dos);
			data2.remove((String) LVSelected.getSelectionModel().getSelectedItem());
			LVCandidates.setItems(this.data);
			LVSelected.setItems(this.data2);

		}
	}

}
