We're going to build a storefront for some Java...in Java.

## Getting Started

```no-highlight
et get java-coffee-shop
cd java-coffee-shop
idea .
```

The model and service layer have been built for you. Your job is to build out the controller and the relevant view templates.

## Meets Expectations Criteria

### List Products

```no-highlight
As a java loving Java developer
I want to see a list of products
So that I can decide on what I want
```

Acceptance Criteria:

- When I navigate to `/products`, I should see all three provided products from my session.
- For each product, I should see their name, price, and caffeine rating.
- For each product, there should be a link that takes me to `/products/show/<productId>` where `productId` is the id of the product

### Show Product

```no-highlight
As a java loving Java developer
I want to see more detail about an individual product
So that I can better decide on what I want
```

Acceptance Criteria:

- When I navigate to `/products/show/<productId>` where `productId` is the id of the product, I am presented with the relevant product information
- For the relevant product, I can see the product's name, price, caffeine rating, and description
- I should not see information pertaining to a different product
- There should be a link that takes me back to the index page

### Styling for Caffeine Rating

```no-highlight
As a java loving Java developer
I want to have a visual indicator of caffeine strength
So that I can easily identify a product based on caffeine level
```

Acceptance Criteria:

- When I'm viewing a list of products or an individual product, I see the caffeine rating in red for a low level of caffeine, yellow for a medium level of caffeine, and green for a high level of caffeine

Implementation Details:

- We have supplied a css file for you in `src/main/resources/static/css/main.css`
- You can access this via a `<link>` in your view templates via the path `/css/main.css`, adding the following inside your `<head>` section: `<link rel="stylesheet" href="/css/main.css">`

### Add a New Product

```no-highlight
As a Java loving java peddler
I want to add a product
So that I can entice more java loving Java developers
```

Acceptance Criteria:

- When I navigate to `/products/new`, I am presented with a form to input a new product
- I must enter the product's name, price, caffeine rating, and description

Implementation Details:

- Persist the product in the Session using the provided Session object
- Use the appropriate input field types for the data the user must supply

## Exceeds Expectations Criteria

### Use Lombok

```no-highlight
As a Java developer
I want to update my code to use Lombok
So that my code is more readable
```

Implementation Details:
- Update your model to use Lombok to manage your constructor and all getters and setters for your attributes

### Delete a Product

```no-highlight
As a Java loving java peddler
I want to delete a product
So that I can be clear on what my inventory is
```

Acceptance Criteria:

- When I navigate to my show page at `/products/show/<productId>`, I see a button to "Delete Product" at the bottom
- This button should kick off a delete request, and remove the given product from my session
- Upon deletion, I'm sent back to my index page, where I can see that the product has been removed from my list
