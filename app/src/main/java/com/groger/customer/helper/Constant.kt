package com.groger.customer.helper

import com.groger.customer.model.Cart

object Constant {

    //MODIFICATION PART

    //Admin panel url with it would be necessary to put "/"(slash) at end of the url (https://admin.panel.url/)
    //const val MainBaseURL = "https://grocery.pojotech.in/"
    const val MainBaseURL = "https://kreeneats.com/"

    //If you have eCart Website then place here website URL otherwise admin panel url with it would be necessary to put "/"(slash) at end of the url (https://admin.panel.url/)
    const val WebsiteUrl = "https://ecartweb.thewrteam.in/theme-2/"

    //set your jwt secret key here...key must same in PHP and Android
    const val JWT_KEY = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE3MDk0NTk0OTEsImlzcyI6ImVLYXJ0IiwiZXhwIjoxNzA5NDYxMjkxLCJzdWIiOiJlS2FydCBBdXRoZW50aWNhdGlvbiIsIndlYiI6IjI5MjYwNDE4IiwiY3VzdCI6IjIyMDE1OTExIiwiYWRtaW4iOiIzMDI4ODQ0MiJ9.bgH-PgHrdhfbr1NGeZs6D66AsxoS_bDI29VYYaPKwkE"

    const val GRID_COLUMN = 4 //Category View Number Of Grid Per Line

    const val LOAD_ITEM_LIMIT = 10 //Load items limit in listing ,Maximum load item once


    const val LANGUAGE_CODE = "en"

    //MODIFICATION PART END
    private const val BaseUrl = MainBaseURL + "api-firebase/"

    //Do not change anything in this link**************************************************
    const val PLAY_STORE_LINK = "https://play.google.com/store/apps/details?id="
    const val PLAY_STORE_RATE_US_LINK = "market://details?id="

    //*************************************************************************************
    //PayTm configs
    const val WEBSITE_LIVE_VAL = "WEB"
    const val INDUSTRY_TYPE_ID_LIVE_VAL = "Retail"
    const val MOBILE_APP_CHANNEL_ID_LIVE_VAL = "WAP"

    //    public static final String PAYTM_ORDER_PROCESS_LIVE_URL = "https://securegw.paytm.in/order/process";
    const val WEBSITE_DEMO_VAL = "WEBSTAGING"
    const val INDUSTRY_TYPE_ID_DEMO_VAL = "Retail"
    const val MOBILE_APP_CHANNEL_ID_DEMO_VAL = "WAP"
    const val PAYTM_ORDER_PROCESS_DEMO_VAL = "https://securegw-stage.paytm.in/order/process"
    const val GENERATE_PAYTM_CHECKSUM = MainBaseURL + "paytm/generate-checksum.php"
    const val VALID_TRANSACTION = "$MainBaseURL/paytm/valid-transction.php"
    const val CALLBACK_URL = "CALLBACK_URL"
    const val CHECK_SUM_HASH = "CHECKSUMHASH"
    const val ORDER_ID_ = "ORDER_ID"
    const val CHANNEL_ID = "CHANNEL_ID"
    const val INDUSTRY_TYPE_ID = "INDUSTRY_TYPE_ID"
    const val WEBSITE = "WEBSITE"
    const val TXN_AMOUNT = "TXN_AMOUNT"
    const val MID = "MID"

    //**********APIS**********
    const val FAQ_URL = BaseUrl + "get-faqs.php"
    const val INVOICE_URL = MainBaseURL + "invoice-for-mobile.php"
    const val CategoryUrl = BaseUrl + "get-categories.php"
    const val Get_RazorPay_OrderId = BaseUrl + "create-razorpay-order.php"
    const val SubcategoryUrl = BaseUrl + "get-subcategories-by-category-id.php"
    const val GET_SECTION_URL = BaseUrl + "sections.php"
    const val GET_SUPPORT_TICKET_URL = BaseUrl + "support-ticket.php"
    const val GET_ADDRESS_URL = BaseUrl + "user-addresses.php"
    const val RegisterUrl = BaseUrl + "user-registration.php"
    const val PAPAL_URL = MainBaseURL + "paypal/create-payment.php"
    const val LoginUrl = BaseUrl + "login.php"
    const val GET_ALL_DATA_URL = BaseUrl + "get-all-data.php"
    const val GET_ALL_PRODUCTS_URL = BaseUrl + "get-all-products.php"
    const val PRODUCT_SEARCH_URL = BaseUrl + "products-search.php"
    const val GET_BLOGS_URL = BaseUrl + "get-blogs.php"
    const val SETTING_URL = BaseUrl + "settings.php"
    const val GET_PRODUCT_BY_SUB_CATE = BaseUrl + "get-products-by-subcategory-id.php"
    const val GET_PRODUCT_BY_CATE = BaseUrl + "get-products-by-category-id.php"
    const val GET_FAVORITES_URL = BaseUrl + "favorites.php"
    const val GET_OFFLINE_FAVORITES_URL = BaseUrl + "get-products-offline.php"
    const val MIDTRANS_PAYMENT_URL = MainBaseURL + "midtrans/create-payment.php"
    const val GET_OFFLINE_CART_URL = BaseUrl + "get-variants-offline.php"
    const val GET_PRODUCT_DETAIL_URL = BaseUrl + "get-product-by-id.php"
    const val CITY_URL = BaseUrl + "get-cities.php"
    const val GET_AREA_BY_CITY = BaseUrl + "get-areas-by-city-id.php"
    const val ORDER_PROCESS_URL = BaseUrl + "order-process.php"
    const val USER_DATA_URL = BaseUrl + "get-user-data.php"
    const val CART_URL = BaseUrl + "cart.php"
    const val STRIPE_BASE_URL = MainBaseURL + "stripe/create-payment.php"
    const val GET_SIMILAR_PRODUCT_URL = BaseUrl + "get-similar-products.php"
    const val TRANSACTION_URL = BaseUrl + "get-user-transactions.php"
    const val PROMO_CODE_CHECK_URL = BaseUrl + "validate-promo-code.php"
    const val VERIFY_PAYMENT_REQUEST = BaseUrl + "payment-request.php"
    const val REGISTER_DEVICE_URL = BaseUrl + "store-fcm-id.php"
    const val FLASH_SALES_URL = BaseUrl + "flash-sales.php"

    //**************parameters***************
    const val VERIFY_PAY_STACK = "verify_paystack_transaction"
    const val AccessKey = "accesskey"
    const val AccessKeyVal = "90336"
    const val PROFILE = "profile"
    const val GetVal = "1"
    const val GROSS_AMOUNT = "gross_amount"
    const val AUTHORIZATION = "Authorization"
    const val PARAMS = "params"
    const val GET_PRIVACY = "get_privacy"
    const val GET_TERMS = "get_terms"
    const val GET_ADDRESSES = "get_addresses"
    const val DELETE_ADDRESS = "delete_address"
    const val ADD_ADDRESS = "add_address"
    const val UPDATE_ADDRESS = "update_address"
    const val GET_CONTACT = "get_contact"
    const val GET_ABOUT_US = "get_about_us"
    const val NEW_BALANCE = "new_balance"
    const val ADD_TO_FAVORITES = "add_to_favorites"
    const val REMOVE_FROM_FAVORITES = "remove_from_favorites"
    const val CANCELLED = "cancelled"
    const val GET_NOTIFICATIONS = "get-notifications"
    const val GET_TICKETS = "get_tickets"
    const val GET_MESSAGES = "get_messages"
    const val TICKET_ID = "ticket_id"
    const val GET_ALL_FLASH_SALES = "get-all-flash-sales"
    const val GET_ALL_FLASH_SALES_PRODUCTS = "get-all-flash-sales-products"
    const val RETURNED = "returned"
    const val GET_USER_DATA = "get_user_data"
    const val KEY_BALANCE = "balance"
    const val AWAITING_PAYMENT = "awaiting_payment"
    const val KEY_WALLET_USED = "wallet_used"
    const val WALLET = "wallet"
    const val PAYMENT = "payment"
    const val REDIRECT_URL = "redirect_url"
    const val URL = "url"
    const val ADD_MULTIPLE_ITEMS = "add_multiple_items"
    const val SAVE_FOR_LATER_ITEMS = "save_for_later_items"
    const val GET_REORDER_DATA = "get_reorder_data"
    const val FIRST_NAME = "first_name"
    const val LAST_NAME = "last_name"
    const val PAYER_EMAIL = "payer_email"
    const val COUNTRY_CODE = "country_code"
    const val COUNTRY = "country"
    const val IS_DEFAULT = "is_default"
    const val ITEM_NAME = "item_name"
    const val ITEM_NUMBER = "item_number"
    const val UPDATE_ORDER_ITEM_STATUS = "update_order_item_status"
    const val ADD_PRODUCT_REVIEW = "add_products_review"
    const val ORDER_ITEM_ID = "order_item_id"
    const val PAYMENT_METHODS = "payment_methods"
    const val RAZOR_PAY_KEY = "razorpay_key"
    const val pay_stack_public_key = "paystack_public_key"
    const val UNREAD_NOTIFICATION_COUNT = "unread_notification_count"
    const val UNREAD_WALLET_COUNT = "unread_wallet_count"
    const val UNREAD_TRANSACTION_COUNT = "unread_transaction_count"
    const val flutter_wave_public_key = "flutterwave_public_key"
    const val flutter_wave_secret_key = "flutterwave_secret_key"
    const val flutter_wave_encryption_key = "flutterwave_encryption_key"
    const val flutter_wave_currency_code = "flutterwave_currency_code"
    const val CITY_ID = "city_id"
    const val CITY = "city"
    const val AREA_ID = "area_id"
    const val REFERRAL_CODE = "referral_code"
    const val BALANCE = "balance"
    const val FRIEND_CODE = "friends_code"
    const val SOLD_OUT_TEXT = "Sold Out"
    const val AVAILABLE = "Available"
    const val QTY = "qty"
    const val GET_USER_CART = "get_user_cart"
    const val DELETE_ORDER = "delete_order"
    const val GET_USER_TRANSACTION = "get_user_transactions"
    const val TYPE_TRANSACTION = "transactions"
    const val TYPE_WALLET_TRANSACTION = "wallet_transactions"
    const val SUCCESS = "success"
    const val FAILED = "failed"
    const val PENDING = "pending"
    const val CREDIT = "credit"
    const val REMOVE_FROM_CART = "remove_from_cart"
    const val SORT = "sort"
    const val TYPE = "type"
    const val GET_BLOG_CATEGORIES = "get_blog_categories"
    const val GET_BLOGS = "get_blogs"
    const val UPLOAD_PROFILE = "upload_profile"
    const val IMAGE = "image"
    const val IMAGES = "image[]"
    const val ATTACHMENTS = "attachments[]"
    const val NAME = "name"
    const val ID = "id"
    const val SHIPPED = "shipped"
    const val RECEIVED = "received"
    const val PROCESSED = "processed"
    const val DELIVERED = "delivered"
    const val SUBTITLE = "subtitle"
    const val PRODUCTS = "products"
    const val STATUS = "status"
    const val WALLET_BALANCE = "wallet_balance"
    const val TITLE = "title"
    const val REGISTER = "register"
    const val EMAIL = "email"
    const val MOBILE = "mobile"
    const val LOCAL_PICKUP = "local_pickup"
    const val PICKUP = "pickup"
    const val ALTERNATE_MOBILE = "alternate_mobile"
    const val PASSWORD = "password"
    const val FCM_ID = "fcm_id"
    const val GET_ALL_PRODUCTS_NAME = "get_all_products_name"
    const val IS_USER_LOGIN = "is_user_login"
    const val PINCODE = "pincode"
    const val STATE = "state"
    const val ERROR = "error"
    const val GET_TIMEZONE = "get_timezone"
    const val ORDER_NOTE = "order_note"
    const val VERIFY_USER = "verify-user"
    const val USER_ID = "user_id"
    const val ADD_WALLET_BALANCE = "add_wallet_balance"
    const val RATE = "rate"
    const val REVIEW = "review"
    const val EDIT_PROFILE = "edit-profile"
    const val CHANGE_PASSWORD = "change-password"
    const val CATEGORY_ID = "category_id"
    const val CATEGORIES = "categories"
    const val SLIDER_IMAGES = "slider_images"
    const val SECTIONS = "sections"
    const val OFFER_IMAGES = "offer_images"
    const val SLIDER_OFFER_IMAGES = "slider_offer_images"
    const val CATEGORY_OFFER_IMAGES = "category_offer_images"
    const val FLASH_SALE_OFFER_IMAGES = "flash_sales_offer_images"
    const val FLASH_SALES = "flash_sales"
    const val SUB_CATEGORY_ID = "subcategory_id"
    const val GET_ALL_PRODUCTS = "get_all_products"
    const val GET_ALL_SECTIONS = "get-all-sections"
    const val SECTION_ID = "section_id"
    const val FLASH_SALES_ID = "flash_sales_id"
    const val GET_FAVORITES = "get_favorites"
    const val GET_FAVORITES_OFFLINE = "get_products_offline"
    const val GET_CART_OFFLINE = "get_variants_offline"
    const val PRODUCT_SEARCH = "products-search"
    const val SEARCH = "search"
    const val GET_TICKET_TYPE = "get_ticket_type"
    const val GET_PROMO_CODES = "get_promo_codes"
    const val ADD_TRANSACTION = "add_transaction"
    const val GET_PAYMENT_METHOD = "get_payment_methods"
    const val GET_ORDERS = "get_orders"
    const val CONTACT = "contact"
    const val DATA = "data"
    const val SAVE_FOR_LATER = "save_for_later"
    const val PRODUCT_REVIEW = "product_review"
    const val ITEMS = "items"
    const val PRODUCT_ID = "product_id"
    const val GET_SIMILAR_PRODUCT = "get_similar_products"
    const val PRODUCT_IDs = "product_ids"
    const val VARIANT_IDs = "variant_ids"
    const val SETTINGS = "settings"
    const val GET_TIME_SLOT_CONFIG = "get_time_slot_config"
    const val TIME_SLOT_CONFIG = "time_slot_config"
    const val IS_TIME_SLOTS_ENABLE = "is_time_slots_enabled"
    const val DELIVERY_STARTS_FROM = "delivery_starts_from"
    const val ALLOWED_DAYS = "allowed_days"
    const val paypal_method = "paypal_payment_method"
    const val razor_pay_method = "razorpay_payment_method"
    const val cod_payment_method = "cod_payment_method"
    const val cod_mode = "cod_mode"
    const val product = "product"
    const val paystack_method = "paystack_payment_method"
    const val flutter_wave_payment_method = "flutterwave_payment_method"
    const val midtrans_payment_method = "midtrans_payment_method"
    const val stripe_payment_method = "stripe_payment_method"
    const val paytm_payment_method = "paytm_payment_method"
    const val paytm_merchant_id = "paytm_merchant_id"
    const val paytm_merchant_key = "paytm_merchant_key"
    const val paytm_mode = "paytm_mode"
    const val ssl_method = "ssl_method"
    const val ssl_mode = "ssl_mode"
    const val ssl_store_id = "ssl_store_id"
    const val ssl_store_password = "ssl_store_password"
    const val direct_bank_transfer_method = "direct_bank_transfer_method"
    const val account_name = "account_name"
    const val account_number = "account_number"
    const val bank_name = "bank_name"
    const val bank_code = "bank_code"
    const val notes = "notes"
    const val CURRENCY = "currency"
    const val GET_FAQS = "get_faqs"
    const val LIMIT = "limit"
    const val OFFSET = "offset"
    const val LATITUDE = "latitude"
    const val LONGITUDE = "longitude"
    const val AMOUNT = "amount"
    const val REFERENCE = "reference"
    const val PROMO_DISCOUNT = "promo_discount"
    const val TOTAL = "total"
    const val NUMBER_OF_REVIEW = "number_of_reviews"
    const val PRODUCT_VARIANT_ID = "product_variant_id"
    const val QUANTITY = "quantity"
    const val USER_NAME = "user_name"
    const val USER = "user"
    const val DELIVERY_CHARGE = "delivery_charge"
    const val DELIVERY_TIME = "delivery_time"
    const val PAYMENT_METHOD = "payment_method"
    const val ADDRESS = "address"
    const val ADDRESS_LINE1 = "address_line1"
    const val POSTAL_CODE = "postal_code"
    const val LANDMARK = "landmark"
    const val TRANS_ID = "txn_id"
    const val MESSAGE = "message"
    const val FINAL_TOTAL = "final_total"
    const val FROM = "from"
    const val VARIANT_POSITION = "variant_position"
    const val ORDER_ID = "order_id"
    const val TICKET_TYPE_ID = "ticket_type_id"
    const val DELETE_BANK_TRANSFER_ATTACHMENT = "delete_bank_transfers_attachment"
    const val UPLOAD_BANK_TRANSFER_ATTACHMENT = "upload_bank_transfers_attachment"
    const val ADD_TICKET = "add_ticket"
    const val EDIT_TICKET = "edit_ticket"
    const val SEND_MESSAGE = "send_message"
    const val publishableKey = "publishableKey"
    const val clientSecret = "clientSecret"
    const val UPDATE_ORDER_STATUS = "update_order_status"
    const val PLACE_ORDER = "place_order"
    const val NEW = "new"
    const val OLD = "old"
    const val HIGH = "high"
    const val LOW = "low"
    const val SLUG = "slug"
    const val GET_PRODUCT_REVIEW = "get_product_reviews"
    const val PROMO_CODE = "promo_code"
    val filterValues = arrayOf<CharSequence>(
        " Newest to Oldest ",
        " Oldest to Newest ",
        " Price Highest to Lowest ",
        " Price Lowest to Highest "
    )
    const val CUST_ID = "CUST_ID"
    const val ORDERID = "ORDERID"
    const val STATUS_ = "STATUS"
    const val TXN_SUCCESS = "TXN_SUCCESS"
    const val minimum_version_required = "minimum_version_required"
    const val is_version_system_on = "is_version_system_on"
    const val support_system = "support_system"
    const val currency = "currency"
    const val current_date = "current_date"
    const val min_order_amount = "min_order_amount"
    const val min_order_amount_for_free_delivery = "min_amount"
    const val delivery_charge = "delivery_charge"
    const val max_cart_items_count = "max_cart_items_count"
    const val area_wise_delivery_charge = "area_wise_delivery_charge"
    const val is_refer_earn_on = "is_refer_earn_on"
    const val refer_earn_bonus = "refer_earn_bonus"
    const val refer_earn_method = "refer_earn_method"
    const val max_refer_earn_amount = "max_refer_earn_amount"
    const val max_product_return_days = "max_product_return_days"
    const val user_wallet_refill_limit = "user_wallet_refill_limit"
    const val min_refer_earn_order_amount = "min_refer_earn_order_amount"
    const val ratings = "ratings"
    const val local_pickup = "local_pickup"
    const val support_number = "support_number"
    const val map_latitude = "map_latitude"
    const val map_longitude = "map_longitude"
    const val store_address = "store_address"
    const val under_maintenance_system = "customer_app_under_maintenance"
    private const val ALPHA_NUMERIC_STRING =
        "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghjiklmnopqrstuvwxyz"
    private const val NUMERIC_STRING = "123456789"

    //**************Constants Values***************
    var isCODAllow = true
    var TOOLBAR_TITLE = ""
    var selectedAddressId = ""
    var DefaultAddress = ""
    var DefaultCity = ""
    var DefaultPinCode = ""
    var U_ID = ""
    var selectedDatePosition = 0
    var FLOAT_TOTAL_AMOUNT = 0.0
    var TOTAL_CART_ITEM = 0
    var isOrderCancelled = false
    var FRIEND_CODE_VALUE = ""
    var PAYPAL = ""
    var RAZORPAY = ""
    var COD = ""
    var COD_MODE = ""
    var PAY_STACK = ""
    var FLUTTER_WAVE = ""
    var MIDTRANS = ""
    var STRIPE = ""
    var PAYTM_MERCHANT_ID = ""
    var PAYTM = ""
    var PAYTM_MERCHANT_KEY = ""
    var PAYTM_MODE = ""
    var RAZOR_PAY_KEY_VALUE = ""
    var PAY_STACK_KEY = ""
    var FLUTTER_WAVE_PUBLIC_KEY_VAL = ""
    var FLUTTER_WAVE_SECRET_KEY_VAL = ""
    var FLUTTER_WAVE_ENCRYPTION_KEY_VAL = ""
    var FLUTTER_WAVE_CURRENCY_CODE_VAL = ""
    var SSLECOMMERZ = ""
    var SSLECOMMERZ_MODE = ""
    var SSLECOMMERZ_STORE_ID = ""
    var SSLECOMMERZ_SECRET_KEY = ""
    var DIRECT_BANK_TRANSFER = ""
    var ACCOUNT_NAME = ""
    var ACCOUNT_NUMBER = ""
    var BANK_NAME = ""
    var BANK_CODE = ""
    var NOTES = ""
    var countList = ArrayList<Cart>()
    var CartValues = HashMap<String, String>()

    @JvmStatic
    fun randomAlphaNumeric(count: Int): String {
        var count1 = count
        val builder = StringBuilder()
        while (count1-- != 0) {
            val character = (Math.random() * ALPHA_NUMERIC_STRING.length).toInt()
            builder.append(ALPHA_NUMERIC_STRING[character])
        }
        return builder.toString()
    }

    @JvmStatic
    fun randomNumeric(count: Int): String {
        var count1 = count
        val builder = StringBuilder()
        while (count1-- != 0) {
            val character = (Math.random() * NUMERIC_STRING.length).toInt()
            builder.append(NUMERIC_STRING[character])
        }
        return builder.toString()
    }
}