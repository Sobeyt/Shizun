package com.sobeit.shizun.helpers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created on 02/junio/18.
 * Created by Ullysses
 *
 * @author Ulises Tuz Interian
 * @email ullydetei@gmail.com
 */

public class StringHelper {

    public static String dateFormat(Date value) {
        //noinspection SimpleDateFormatWithoutLocale
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy", new Locale("es","MX")); //NON-NLS
        return df.format(value);
    }
}
