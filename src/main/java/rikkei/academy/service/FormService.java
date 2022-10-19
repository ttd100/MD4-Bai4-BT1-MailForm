package rikkei.academy.service;

import rikkei.academy.model.Form;

public class FormService {

    private static Form form = new Form();

    public static Form getForm() {
        return form;
    }

    public static void updateForm(Form eForm) {
        form = eForm;
    }
}