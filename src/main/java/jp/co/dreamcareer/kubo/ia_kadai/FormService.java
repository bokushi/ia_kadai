package jp.co.dreamcareer.kubo.ia_kadai;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService {
    @Autowired
    private FormDataRepository formDataRepository;

    public void saveFormData(FormData formData) {
        formDataRepository.save(formData);
    }

    public List<FormData> getAllFormDatas() {
        return formDataRepository.findAll();
    }

    public void delete(int id) {
        formDataRepository.deleteById(id);
    }
}
